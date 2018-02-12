package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created with IntelliJ IDEA.
 *
 * @author chengrongzhong on 2018/2/11 13:58
 */
@ComponentScan(basePackages={"com"})
@SpringBootApplication
@EnableAutoConfiguration
public class FourgearMotanClient extends SpringBootServletInitializer {

    private static Logger logger = LoggerFactory.getLogger(FourgearMotanClient.class);

    public static void main(String[] args) {
        SpringApplication.run(FourgearMotanClient.class, args);
        logger.info("===== Client Start =====");
    }
}
