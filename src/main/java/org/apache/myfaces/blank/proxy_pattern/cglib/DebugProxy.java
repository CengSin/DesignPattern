package org.apache.myfaces.blank.proxy_pattern.cglib;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

/**
 * @description: design_pattern
 * @author: 15262
 * @date: 2020/4/17
 */

public class DebugProxy {

    public static Object newInstance(Class targetClass) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targetClass);
        Callback noOp = NoOp.INSTANCE;
        Callback methodInterceptor = new MethodInterceptorImpl();
        Callback[] callbacks = new Callback[]{methodInterceptor, noOp};
        // enhancer.setCallback(methodInterceptor);
        enhancer.setCallbackFilter(new CallBackFilterImpl());
        enhancer.setCallbacks(callbacks);
        return enhancer.create();
    }

}
