package org.ljf.aopdemo.fuse_mode.hystrix_demo.thread_pool_full;

/**
 * description
 *
 * @author ljf 2019/10/14 20:08
 */
public class MyService {
    public void doSth(String thing) {
        System.out.println("doSth->" + thing + "->begin");
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + ":doSth->" + thing + "->doing");
        try {
            Thread.sleep(15000);//这里让线程等待15s，保持线程不释放
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("doSth->" + thing + "->end");
    }
}
