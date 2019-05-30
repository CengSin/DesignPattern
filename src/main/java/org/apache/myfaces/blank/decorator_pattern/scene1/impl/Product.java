package org.apache.myfaces.blank.decorator_pattern.scene1.impl;

import org.apache.myfaces.blank.decorator_pattern.scene1.Model;

/**
 * @ClassName Product
 * @Description 产品实体类
 * @Author zhangzetao
 * @Date 2019/5/30 12:49
 * @Version 1.0
 **/
public class Product implements Model {
    @Override
    public void add() {
        System.out.println("产品属性新增方法");
    }

    @Override
    public void sub() {
        System.out.println("产品属性减少方法");
    }
}
