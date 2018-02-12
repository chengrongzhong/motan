package com.conf;

import com.weibo.api.motan.config.springsupport.AnnotationBean;
import com.weibo.api.motan.config.springsupport.BasicRefererConfigBean;
import com.weibo.api.motan.config.springsupport.ProtocolConfigBean;
import com.weibo.api.motan.config.springsupport.RegistryConfigBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 *
 * @author chengrongzhong on 2018/2/11 14:21
 */
@Configuration
public class MotanConfiguration {
    /**
     * @Description: 声明Annotation用来指定需要解析的包名
     * @author: chengrongzhong
     */
    @Bean
    @ConfigurationProperties(prefix = "fourgear.motan.annotation")
    public AnnotationBean motanAnnotationBean() {
        AnnotationBean motanAnnotationBean = new AnnotationBean();
//        motanAnnotationBean.setPackage("com.fourgear.motan");
        return motanAnnotationBean;
    }

    /**
     * @Description: 协议配置
     * @author: chengrongzhong
     */
    @Bean(name = "fourgearMotan")
    @ConfigurationProperties(prefix = "fourgear.motan.protocol")
    public ProtocolConfigBean protocolConfig() {
        ProtocolConfigBean config = new ProtocolConfigBean();
//        config.setDefault(true);
//        config.setName("fourgearMotan");
//        config.setMaxContentLength(1048576);
        return config;
    }

    /**
     * @Description: 注册中心配置
     * @author: chengrongzhong
     */
    @Bean(name = "fourgearRegistryConfig")
    @ConfigurationProperties(prefix = "fourgear.motan.registry")
    public RegistryConfigBean registryConfig() {
        RegistryConfigBean config = new RegistryConfigBean();
//        config.setRegProtocol("zookeeper");
//        config.setAddress("127.0.0.1:4444");
        return config;
    }

    /**
     * @Description: 客户端配置
     * @author: chengrongzhong
     */
    @Bean(name = "fourgearClientBasicConfig")
    @ConfigurationProperties(prefix = "fourgear.motan.client")
    public BasicRefererConfigBean baseRefererConfig() {
        BasicRefererConfigBean config = new BasicRefererConfigBean();
//        config.setProtocol("motan");
//        config.setRegistry("registry");
//        config.setThrowException(true);
        return config;
    }
}
