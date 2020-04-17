package org.apache.myfaces.blank.proxy_pattern.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description: design_pattern
 * @author: 15262
 * @date: 2020/4/17
 */

public class MethodInterceptorImpl implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("方法拦截pred");
        Object invoke = proxy.invokeSuper(obj, args);
        System.out.println("方法拦截succ");
        return invoke;
    }

}
