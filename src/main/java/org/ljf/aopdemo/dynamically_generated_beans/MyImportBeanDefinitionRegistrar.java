package org.ljf.aopdemo.dynamically_generated_beans;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * description:学习动态创建bean,学习beandefinnition的使用
 *
 * @author ljf 2019/10/10 13:50
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    protected String BEAN_NAME="myservice";
    public void dynamicConfiguration() throws Exception{}

    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata,
                                        BeanDefinitionRegistry beanDefinitionRegistry) {
        if(!beanDefinitionRegistry.containsBeanDefinition(BEAN_NAME)){
            GenericBeanDefinition genericBeanDefinition=new GenericBeanDefinition();
            //genericBeanDefinition.setBeanClass(MyService.class);  //todo
            genericBeanDefinition.setSynthetic(true);
            beanDefinitionRegistry.registerBeanDefinition(BEAN_NAME,genericBeanDefinition);
        }
    }
}
