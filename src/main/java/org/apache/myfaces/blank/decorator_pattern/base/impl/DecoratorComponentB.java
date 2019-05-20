package org.apache.myfaces.blank.decorator_pattern.base.impl;

import org.apache.myfaces.blank.decorator_pattern.base.Decorator;

/**
 * @ClassName DecoratorComponentB
 * @Description 装饰对象B
 * @Author zhangzetao
 * @Date 2019/5/20 12:46
 * @Version 1.0
 **/
public class DecoratorComponentB extends Decorator {

    @Override
    public void Operation() {
        super.Operation();
        bOperator();
        System.out.println("装饰对象B的操作");
    }

    private void bOperator() {
        System.out.println("装饰功能B");
    }
}
