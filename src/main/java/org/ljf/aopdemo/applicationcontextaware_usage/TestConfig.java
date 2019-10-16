package org.ljf.aopdemo.applicationcontextaware_usage;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * description
 *
 * @author ljf 2019/10/10 16:27
 */

@Configuration
public class TestConfig {
    @Bean
    public SpringContextHelper getSpringContextHepler() {
        return new SpringContextHelper();
    }
}
