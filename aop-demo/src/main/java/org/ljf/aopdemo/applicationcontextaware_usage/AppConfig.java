package org.ljf.aopdemo.applicationcontextaware_usage;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * description
 *
 * @author ljf 2019/10/10 16:32
 */
@Import({TestConfig.class})
@Configuration
public class AppConfig {
}
