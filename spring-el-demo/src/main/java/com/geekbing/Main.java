package com.geekbing;

import com.geekbing.Config.ElConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Bing on 9/21/16.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig elConfig = context.getBean(ElConfig.class);
        elConfig.outputResource();

        context.close();
    }
}
