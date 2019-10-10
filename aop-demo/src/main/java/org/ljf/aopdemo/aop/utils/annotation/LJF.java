package org.ljf.aopdemo.aop.utils.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 1 * @Author: ljf
 * 2 *@version: v1.0
 * 3 *@description: org.ljf.aopdemo.aop.utils.annotation
 * 4 * @Date: 2019/9/3 15:15
 * 5
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LJF {
    /**
     * 何种场景下的通用日志打印
     *
     * @return
     */
    //String module();
}
