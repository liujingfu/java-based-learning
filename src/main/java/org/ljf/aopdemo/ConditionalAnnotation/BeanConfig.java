package org.ljf.aopdemo.ConditionalAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

/**
 * description
 *
 * @author ljf 2019/09/25 16:51
 */
//@Conditional({WindowsCondition.class,ObstinateCondition.class})
public class BeanConfig {
    @Conditional({WindowsCondition.class})
    @Bean(name = "bill")
    public Person person1(){
        return new Person("Bill Gates",62);
    }
    @Conditional({LinuxCondition.class})
    @Bean("linus")
    public Person person2(){
        return new Person("Linus",48);
    }

}
