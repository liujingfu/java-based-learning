package org.ljf.aopdemo.dynamically_generated_beans;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

/**
 * description 使用自定义工厂创建bean
 *
 * @author ljf 2019/10/10 14:58
 */
public class JdbcPlusBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata,
                                        BeanDefinitionRegistry registry) {
//        AnnotationAttributes attributes=AnnotationAttributes.fromMap(
//                 annotationMetadata.getAnnotationAttributes(JdbcMapperScan.class.getName())
//        )
    }
}
