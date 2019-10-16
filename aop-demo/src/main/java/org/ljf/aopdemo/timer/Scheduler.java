package org.ljf.aopdemo.timer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * description
 *
 * @author ljf 2019/10/10 17:40
 */
@Component
public class Scheduler {
    @Scheduled(cron="0 0/1 * * * ?")
    public void statusCheck() {
        System.out.println("每1分钟执行一次");
    }
    @Scheduled(fixedRate=10000)
    public void testTasks() {
        System.out.println("每10秒执行一次。");
    }
}
