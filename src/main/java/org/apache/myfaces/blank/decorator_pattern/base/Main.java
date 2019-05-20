package org.apache.myfaces.blank.decorator_pattern.base;

import org.apache.myfaces.blank.decorator_pattern.base.impl.ConcreteComponent;
import org.apache.myfaces.blank.decorator_pattern.base.impl.DecoratorComponentA;
import org.apache.myfaces.blank.decorator_pattern.base.impl.DecoratorComponentB;

/**
 * @ClassName Main
 * @Description TODO
 * @Author zhangzetao
 * @Date 2019/5/20 12:47
 * @Version 1.0
 **/
public class Main {

    public static void main(String[] args) {
        Component c = new ConcreteComponent();
        Decorator b1 = new DecoratorComponentA();
        Decorator b2 = new DecoratorComponentB();

        b1.setComponent(c);
        b2.setComponent(b1);

        b2.Operation();
    }

}
