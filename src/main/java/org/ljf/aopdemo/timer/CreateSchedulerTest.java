package org.ljf.aopdemo.timer;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.DirectSchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;

/**
 * description
 *
 * @author ljf 2019/10/10 19:46
 */
public class CreateSchedulerTest {
    public static void main(String[] args) {

        try {
            //第一种方式
            SchedulerFactory schedulerFactory = new StdSchedulerFactory();
            Scheduler scheduler = schedulerFactory.getScheduler();
            //第二种方式
            DirectSchedulerFactory directSchedulerFactory=DirectSchedulerFactory.getInstance();
            Scheduler scheduler1=directSchedulerFactory.getScheduler();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}
