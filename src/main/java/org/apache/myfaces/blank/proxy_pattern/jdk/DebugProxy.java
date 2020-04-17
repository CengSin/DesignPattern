package org.apache.myfaces.blank.proxy_pattern.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description: design_pattern
 * @author: 15262
 * @date: 2020/4/17
 */

public class DebugProxy implements InvocationHandler {

    private Object obj;

    public static Object newInstance(Object obj) {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new DebugProxy(obj));
    }

    public DebugProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;

        try {
            System.out.println("before method " + method.getName());
            result = method.invoke(obj, args);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (Exception e) {
            throw new RuntimeException("unexpected invocation exception: "+ e.getMessage());
        } finally {
            System.out.println("after method " + method.getName());
        }
        return result;
    }
}
