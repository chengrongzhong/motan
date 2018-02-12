package com.fourgear.motan.server.service.impl;


import com.fourgear.motan.core.service.TestService;
import com.weibo.api.motan.config.springsupport.annotation.MotanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @author chengrongzhong on 2018/2/11 13:56
 */
@MotanService
public class TestServiceImpl implements TestService {

    private static Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);

    @Override
    public String hello(String world) {
        logger.info("hello " + world);
        return "hello " + world;
    }

}
