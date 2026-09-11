package com.camunda.consulting.demo.camunda7demoapplication.delegate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("sampleBean")
public class SampleBean {

    private static final Logger LOGGER = LoggerFactory.getLogger(SampleBean.class);

    public void someMethod(String y) {
        LOGGER.info("sampleBean.someMethod called with y={}", y);
    }
}
