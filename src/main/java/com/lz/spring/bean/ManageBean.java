package com.lz.spring.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ManageBean {
    private static Logger logger = LoggerFactory.getLogger(ManageBean.class);

    public ManageBean() {
        logger.info("Manage Bean constructor...");
    }
}
