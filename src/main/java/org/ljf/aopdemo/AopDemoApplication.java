package org.ljf.aopdemo;

import org.ljf.aopdemo.aop.utils.log.LoggerApply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
//@EnableHystrixDashboard
//@EnableTurbine
public class AopDemoApplication {
@Autowired
    LoggerApply loggerApply;

    public static void main(String[] args) {
        SpringApplication.run(AopDemoApplication.class, args);

    }
}
