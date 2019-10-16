package org.ljf.aopdemo.fuse_mode.hystrix_demo.failure_rate;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.strategy.properties.HystrixPropertiesCommandDefault;

/**
 * description
 *
 * @author ljf 2019/10/14 20:58
 */
public class PercentCommand extends HystrixCommand<String> {
    private final String group;
    private PercentService service;
    private int seed;

    public PercentCommand(String group, int seed) {
        super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey(group))
                .andCommandPropertiesDefaults(HystrixPropertiesCommandDefault.Setter()
                        .withCircuitBreakerErrorThresholdPercentage(50)//错误率超过50%,快速失败
                        .withExecutionTimeoutInMilliseconds(2000)
                        .withCircuitBreakerRequestVolumeThreshold(5)
                        .withCircuitBreakerSleepWindowInMilliseconds(30000)//30s后放部分流量过去重试
                        .withMetricsRollingPercentileBucketSize(10)
                        .withMetricsRollingPercentileWindowInMilliseconds(5000)));
        this.group = group;
        this.seed = seed;
    }


    @Override
    protected String run() throws Exception {
        return service.ex(seed);
    }
    public void setService(PercentService service) {
        this.service = service;
    }
    @Override
    protected String getFallback() {
        return seed + "失败了";
    }
}
