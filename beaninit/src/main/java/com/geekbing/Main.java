package com.geekbing;

import com.geekbing.Config.BeanConfig;
import com.geekbing.Service.BeanWayService;
import com.geekbing.Service.JSRWayService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Bing on 9/21/16.
 */
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        JSRWayService jsrWayService = context.getBean(JSRWayService.class);

        context.close();
    }
}
