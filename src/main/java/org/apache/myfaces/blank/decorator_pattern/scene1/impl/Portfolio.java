package org.apache.myfaces.blank.decorator_pattern.scene1.impl;

import org.apache.myfaces.blank.decorator_pattern.scene1.Model;

/**
 * @ClassName Portfolio
 * @Description 组合实现类
 * @Author zhangzetao
 * @Date 2019/5/30 12:52
 * @Version 1.0
 **/
public class Portfolio implements Model {
    @Override
    public void add() {
        System.out.println("组合属性新增方法");
    }

    @Override
    public void sub() {
        System.out.println("组合属性减少方法");
    }
}
