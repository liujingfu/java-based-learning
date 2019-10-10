package org.ljf.aopdemo.aop.test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;

/**
 * 1 * @Author: ljf
 * 2 *@version: v1.0
 * 3 *@description: org.ljf.aopdemo.aop
 * 4 * @Date: 2019/9/3 14:22
 * 5
 */
public class Aspect {
    //前置增强
    @Before(value="execution(public * *(..))")
    public void asBefore(){
        System.out.println("这是前置增强");
    }
    //后置增强
    @AfterReturning(value="execution(public * *(..))")
    public void asAfterReturning(){
        System.out.println("这是后置增强");
    }
    //环绕增强
    @Around(value="execution(public * *(..))")
    public void asAround(ProceedingJoinPoint pj){
        System.out.println("这是环绕前置增强");
        try {
            pj.proceed();
        } catch (Throwable e) {
            //抓捕异常
            e.printStackTrace();
        }
        System.out.println("这是环绕后置增强");
    }
    @AfterThrowing(value="execution(public * *(..))")
    public void asThorws(){
        System.out.println("这是异常增强");
    }
}
