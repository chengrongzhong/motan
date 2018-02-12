package com.fourgear.motan.client.controller;

import com.FourgearMotanClient;
import com.fourgear.motan.core.service.TestService;
import com.fourgear.motan.core.service.TestServiceAsync;
import com.weibo.api.motan.config.springsupport.annotation.MotanReferer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 *
 * @author chengrongzhong on 2018/2/11 14:19
 */
@Controller
@RequestMapping("/motan")
public class TestController{

    private static Logger logger = LoggerFactory.getLogger(TestController.class);

    @MotanReferer(basicReferer = "fourgearClientBasicConfig")
    private TestServiceAsync testServiceAsync;

    @MotanReferer(basicReferer = "fourgearClientBasicConfig")
    private TestService testService;

    @ResponseBody
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable String name) throws Exception {
        String message1 = testService.hello("message----1");
        logger.info(message1);
        String message2 = testService.hello("message----2");
        logger.info(message2);
        String result = testService.hello(name);
        logger.info(result);
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/async/{name}", method = RequestMethod.GET)
    public String helloAsync(@PathVariable String name) throws Exception {
        String result = testServiceAsync.hello(name);
        logger.info(result);
        return result;
    }
}
