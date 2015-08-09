package com.typeach.demo.property;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

/**
 * Author: Weijie Zhao
 * Description:
 * Copyright: Copyright (c) 2015
 */
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class ConfigPropertyTest extends AbstractTestNGSpringContextTests {

    public static Logger logger = LoggerFactory.getLogger(ConfigPropertyTest.class);

    @Autowired
    private ConfigProperty configProperty;

    @Test
    public void testLoadProps() {
        logger.info("Author Name: " + configProperty.getAuthor_name());
        logger.info("Project Info: " + configProperty.getProject_info());
    }
}
