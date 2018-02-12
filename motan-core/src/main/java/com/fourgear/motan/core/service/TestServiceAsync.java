package com.fourgear.motan.core.service;

import com.weibo.api.motan.rpc.ResponseFuture;

/**
 * Created with IntelliJ IDEA.
 *
 * @author chengrongzhong on 2018/2/12 10:30
 */
public interface TestServiceAsync extends TestService {
    ResponseFuture helloAsync(String world);
}
