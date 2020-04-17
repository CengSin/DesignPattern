package org.apache.myfaces.blank.proxy_pattern.cglib;

/**
 * @description: design_pattern
 * @author: 15262
 * @date: 2020/4/17
 */

public class CglibProxy {

    public static void main(String[] args) {
        Foo o = (Foo) DebugProxy.newInstance(Foo.class);
        o.hello();
    }

}
