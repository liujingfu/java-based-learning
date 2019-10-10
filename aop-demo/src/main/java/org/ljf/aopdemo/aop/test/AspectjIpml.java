package org.ljf.aopdemo.aop.test;

/**
 * 1 * @Author: ljf
 * 2 *@version: v1.0
 * 3 *@description: org.ljf.aopdemo.aop
 * 4 * @Date: 2019/9/3 14:21
 * 5
 */
public class AspectjIpml  implements AspectDao{
    @Override
    public void add() {
        System.out.println("==ADD==");
    }

    @Override
    public void delete() {
        System.out.println("==DELETE==");
    }
}
