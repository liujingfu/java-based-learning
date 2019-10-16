package org.ljf.aopdemo;

import org.ljf.aopdemo.aop.utils.log.LoggerApply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AopDemoApplication {
@Autowired
    LoggerApply loggerApply;

    public static void main(String[] args) {
        SpringApplication.run(AopDemoApplication.class, args);

    }
}
