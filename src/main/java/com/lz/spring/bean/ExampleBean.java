package com.lz.spring.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleBean {
    private static Logger logger = LoggerFactory.getLogger(ExampleBean.class);

    public ExampleBean() {
        logger.info("Example Bean constructor...");
    }
}
