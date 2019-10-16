package org.ljf.aopdemo.fuse_mode.hystrix_demo.failure_rate;

import org.junit.Test;
import rx.Observable;
import rx.Subscriber;

/**
 * description
 *
 * @author ljf 2019/10/14 21:02
 */
public class PercentTest {
    @Test
    public void test() throws Exception {
        PercentService service = new PercentService();
        for (int i = 0; i < 15; i++) {
            Thread.sleep(1000);
            PercentCommand command = new PercentCommand("TestGroup", i);
            command.setService(service);
            Observable<String> observable = command.toObservable();
            observable.subscribe(new Subscriber<String>() {
                @Override
                public void onCompleted() {

                }

                @Override
                public void onError(Throwable e) {
                    System.out.println("eeeeeeeeeeeeee");
                }

                @Override
                public void onNext(String s) {
                    System.out.println(s);
                }
            });
        }

    }
}
