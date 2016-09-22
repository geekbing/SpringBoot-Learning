package com.geekbing.Config;

import com.geekbing.Service.BeanWayService;
import com.geekbing.Service.JSRWayService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Bing on 9/21/16.
 */
@Configuration
@ComponentScan("com.geekbing")
public class BeanConfig {
    @Bean(initMethod = "init", destroyMethod = "destory")
    BeanWayService beanWayService() {
        return new BeanWayService();
    }

    @Bean
    JSRWayService jsrWayService() {
        return new JSRWayService();
    }
}
