package com.camunda.consulting.demo.camunda7demoapplication;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.camunda.community.extension.internalTaskHandler.springBoot.EnableInternalTaskClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableProcessApplication
@EnableInternalTaskClient
@SpringBootApplication
@EnableScheduling
public class Camunda7DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Camunda7DemoApplication.class, args);
    }

}
