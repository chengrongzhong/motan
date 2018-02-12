package com.fourgear.motan.core.service;


import com.weibo.api.motan.transport.async.MotanAsync;

/**
 * Created with IntelliJ IDEA.
 *
 * @author chengrongzhong on 2018/2/11 13:57
 */
@MotanAsync
public interface TestService {
    String hello(String world);
}