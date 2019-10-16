package org.ljf.aopdemo.fuse_mode.hystrix_demo.thread_pool_full;

import com.netflix.hystrix.*;

/**
 * description 测试线程池满了
 *
 * @author ljf 2019/10/14 20:01
 */
public class MyCommand extends HystrixCommand<String> {
    private final String group;
    private MyService service;
    private String thing;

    public MyCommand(String group, String thing) {
//    super(HystrixCommandGroupKey.Factory.asKey(group));
        //指定特定组名使用命令分组将一起的命令进行管理
        /*
        *CommandGroup是每个命令最少配置的必选参数，在不指定ThreadPoolKey的情况下，字面值用于对不同依赖的线程池/信号区分，
        *也就是在不指定ThreadPoolKey的情况下,CommandGroup用于指定线程池的隔离。命令分组用于对依赖操作分组，便于统计、汇总等
        */
        //command group，代表了某一个底层的依赖服务，合理，一个依赖服务可能会暴露出来多个接口，每个接口就是一个command key
        super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey(group))
                        /*
                        *CommandKey是作为依赖命名，一般来说每个CommandKey代表一个依赖抽象，相同的依赖要使用相同的CommandKey名称。
                        *依赖隔离的根本就是对相同CommandKey的依赖做隔离。不同的依赖隔离最好使用不同的线程池（定义不同的ThreadPoolKey）。
                        *从HystrixCommand源码的注释也可以看到CommandKey也用于对依赖操作统计、汇总等。
                        */
                        //command key，代表了一类command，一般来说，代表了底层的依赖服务的一个接口
                        .andCommandKey(HystrixCommandKey.Factory.asKey("myCommand"))
                        /*
                         * ThreadPoolKey简单来说就是依赖隔离使用的线程池的键值。当对同一业务依赖做隔离时使用CommandGroup做区分，
                         * 但是对同一依赖的不同远程调用如(一个是redis 一个是http)，可以使用HystrixThreadPoolKey做隔离区分。
                         * 虽然在业务上都是相同的组，但是需要在资源上做隔离时，可以使用HystrixThreadPoolKey区分。
                         * （对于每个不同的HystrixThreadPoolKey建议使用不同的CommandKey
                         */
                        .andThreadPoolKey(HystrixThreadPoolKey.Factory.asKey("myCommandThreadPool"))
                        //设置隔离参数设置
                        .andCommandPropertiesDefaults(
                                HystrixCommandProperties.Setter()
                                        //十秒内请求超过5个(n)熔断器开始生效
                                        .withCircuitBreakerRequestVolumeThreshold(5)
                                        //配置错误比例60%
                                        .withCircuitBreakerErrorThresholdPercentage(60)
                                        //.withExecutionTimeoutInMilliseconds(2000)
                                        .withExecutionTimeoutEnabled(false)//配合下方MyService的等待15s，防止超时直接报错
                                        .withMetricsRollingStatisticalWindowInMilliseconds(1000))
                        //配置线程池参数
                        .andThreadPoolPropertiesDefaults(
                                HystrixThreadPoolProperties.Setter()
                                        .withCoreSize(10))//这里我们设置了线程池大小为10
        );
        this.group = group;
        this.thing = thing;
    }

    @Override
    protected String run() throws Exception {
        service.doSth(thing);
        return thing + " over";
    }

    @Override
    protected String getFallback() {
        return thing + " Failure! ";
    }

    public void setService(MyService service) {
        this.service = service;
    }
}
