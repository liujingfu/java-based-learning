package org.ljf.aopdemo.applicationcontextaware_usage;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * description: 在项目中即可通过这个SpringContextHelper
 * 调用getBean()方法得到Spring容器中的对象了
 *
 * @author ljf 2019/10/10 16:09
 */
public class SpringContextHelper implements ApplicationContextAware {
private static ApplicationContext context=null;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
             context=applicationContext;
    }
    public static Object getBean(String name){
        return context.getBean(name);
    }
}
