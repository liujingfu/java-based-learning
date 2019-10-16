package org.ljf.aopdemo.useageOfImportAnnotations.demo;

import org.ljf.aopdemo.useageOfImportAnnotations.bean.TestBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description  导入@Configurition注解的配置类
 *
 * @author ljf 2019/10/10 14:23
 */
//@Configuration
public class TestConfig {
    @Bean
    public TestBean2 getTestBean2(){
        return new TestBean2();
    }
}
