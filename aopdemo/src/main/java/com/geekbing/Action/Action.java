package com.geekbing.Action;

import java.lang.annotation.*;

/**
 * Created by Bing on 9/21/16.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
