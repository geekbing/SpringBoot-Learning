package com.geekbing.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Bing on 9/21/16.
 */
@Configuration
@ComponentScan("com.geekbing")
@EnableAspectJAutoProxy
public class AopConfig {

}
