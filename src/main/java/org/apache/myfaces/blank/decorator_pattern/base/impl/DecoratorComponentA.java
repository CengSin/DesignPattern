package org.apache.myfaces.blank.decorator_pattern.base.impl;

import org.apache.myfaces.blank.decorator_pattern.base.Decorator;

/**
 * @ClassName DecoratorComponentA
 * @Description 装饰类
 * @Author zhangzetao
 * @Date 2019/5/20 12:44
 * @Version 1.0
 **/
public class DecoratorComponentA extends Decorator {

    /**
     * 装饰类A为Component添加的功能
     */
    private String functionA;

    @Override
    public void Operation() {
        super.Operation();
        functionA = "新功能A";
        System.out.println("具体装饰对象A的操作:" + functionA);
    }
}
