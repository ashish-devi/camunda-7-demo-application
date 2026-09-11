package com.camunda.consulting.demo.camunda7demoapplication.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("sampleJavaDelegate")
public class SampleJavaDelegate implements JavaDelegate {

    private static final Logger LOGGER = LoggerFactory.getLogger(SampleJavaDelegate.class);

    @Override
    public void execute(DelegateExecution execution) {
        LOGGER.info("Executing sampleJavaDelegate for process instance {}", execution.getProcessInstanceId());

        int randomNumber = new Random().nextInt(100) + 1;
        if(randomNumber % 2 == 0) {
            execution.setVariable("x", "x-value");

        } else {
            execution.setVariable("x", "not-x-value");

        }
        execution.setVariable("y", "y-value");
        LOGGER.info("sampleJavaDelegate set process variables x and y");
    }
}
