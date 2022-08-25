package com.qa.tests;

import lombok.extern.log4j.Log4j;
import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;

@Log4j
public class TestLog4j {

    @Test
    public void testLog4jLogging(){

        //This will not require any log4j configurator file
        BasicConfigurator.configure();
            log.info("Info message");
            log.debug("Debug msg");
            log.warn("Warning msg");
            log.fatal("FATAL msg, you are dead !!");

    }
}
