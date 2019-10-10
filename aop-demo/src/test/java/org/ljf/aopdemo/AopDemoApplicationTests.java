package org.ljf.aopdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ljf.aopdemo.aop.utils.log.LoggerApply;
import org.ljf.aopdemo.useageOfImportAnnotations.demo.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AopDemoApplicationTests {
@Autowired
    LoggerApply loggerApply;
    @Test
    public void contextLoads() throws Exception {
        loggerApply.ljfLogger("test");
    }
    @Test
   public void demoApplicationTests(){
       AnnotationConfigApplicationContext annotationConfigApplicationContext =
               new AnnotationConfigApplicationContext(AppConfig.class);
       String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
       System.out.println("--------------------------------------------------------");
       for (String beanDefinitionName: beanDefinitionNames) {
           System.out.println(beanDefinitionName);
       }
       System.out.println("--------------------------------------------------------");

    }
}
