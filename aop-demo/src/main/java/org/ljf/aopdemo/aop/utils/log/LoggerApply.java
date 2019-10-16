package org.ljf.aopdemo.aop.utils.log;

import org.ljf.aopdemo.aop.utils.annotation.LJF;
import org.springframework.stereotype.Component;

/**
 * 1 * @Author: ljf
 * 2 *@version: v1.0
 * 3 *@description: org.ljf.aopdemo.aop.utils.log
 * 4 * @Date: 2019/9/3 15:32
 * 5
 */
@Component
public class LoggerApply {
    @LJF
    public void ljfLogger(String event) throws Exception {
        System.out.println("lingLogger(String event) : lingyejun will auth by blog address");
        //throw new Exception();
    }
//这里使用的不是代理对象，所以我们的注解是没有用的
//    public static void main(String[] args) {
//        try {
//            new LoggerApply().ljfLogger("test");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
