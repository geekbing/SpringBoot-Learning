package com.geekbing.Service;

import com.geekbing.Action.Action;
import org.springframework.stereotype.Service;

/**
 * Created by Bing on 9/21/16.
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add操作")
    public void add() {
    }
}
