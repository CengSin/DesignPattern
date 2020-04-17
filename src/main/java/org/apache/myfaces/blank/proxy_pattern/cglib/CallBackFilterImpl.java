package org.apache.myfaces.blank.proxy_pattern.cglib;

import net.sf.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

/**
 * @description: design_pattern
 * @author: 15262
 * @date: 2020/4/17
 */

public class CallBackFilterImpl implements CallbackFilter {

    private int HELLO = 0;
    private int OTHER = 1;

    @Override
    public int accept(Method method) {
        System.out.println("进入回调函数");

        String name = method.getName();
        if (name.equals("hello")) {
            return HELLO;
        }

        return OTHER;
    }

}
