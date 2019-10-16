package org.ljf.aopdemo.useageOfImportAnnotations.demo;

import org.ljf.aopdemo.useageOfImportAnnotations.bean.TestBean1;
import org.ljf.aopdemo.useageOfImportAnnotations.bean.TestImportBeanDefinitionRegistrar;
import org.ljf.aopdemo.useageOfImportAnnotations.bean.TestImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * description:声明一个bean
 *
 * @author ljf 2019/10/10 14:21
 */
//@Import({TestBean1.class,TestConfig.class, TestImportSelector.class, TestImportBeanDefinitionRegistrar.class})
//@Configuration
public class AppConfig {
}
