package com.geekbing.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Bing on 9/22/16.
 */
public class JSRWayService {

    @PostConstruct
    public void init() {
        System.out.println("jsr250-init-method");
    }

    public JSRWayService() {
        super();
        System.out.println("初始化构造函数-jsr250WayService");
    }

    @PreDestroy
    public void destory() {
        System.out.println("jsr250-destory-method");
    }
}
