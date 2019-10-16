package org.ljf.aopdemo.fuse_mode.hystrix_demo.thread_pool_full;

import org.junit.Test;
import rx.Observable;
import rx.Subscriber;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/**
 * description
 *
 * @author ljf 2019/10/14 20:14
 */
public class MyTest {
    @Test
    public void test() throws Exception {
        MyService service = new MyService();
        List<Future<String>> fl = new ArrayList<>(10);
        for (int i = 0; i < 15; i++) {
            Thread.sleep(1000);
            MyCommand command = new MyCommand("TestGroup", "fishing" + (i * i));
            command.setService(service);
            Observable<String> observable = command.toObservable();
            observable.subscribe(new Subscriber<String>() {
                @Override
                public void onCompleted() {

                }

                @Override
                public void onError(Throwable e) {
                    System.out.println("执行command发生错误！");
                    e.printStackTrace();
                }

                @Override
                public void onNext(String s) {
                    System.out.println(s);
                }
            });
        }
    }
}
