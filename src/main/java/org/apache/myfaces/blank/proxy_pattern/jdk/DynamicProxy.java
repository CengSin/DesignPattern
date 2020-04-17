package org.apache.myfaces.blank.proxy_pattern.jdk;

/**
 * @description: JDK Dynamic proxy  https://docs.oracle.com/javase/8/docs/technotes/guides/reflection/proxy.html#examples
 * @author: 15262
 * @date: 2020/4/17
 */

public class DynamicProxy {

    public static void main(String[] args) {
        try {
            Foo foo = (Foo) DebugProxy.newInstance(new FooImpl());
            foo.bar(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
