package org.apache.myfaces.blank.decorator_pattern.scene1.impl;

import org.apache.myfaces.blank.decorator_pattern.scene1.Model;

/**
 * @ClassName InvestAccount
 * @Description 账户实现类
 * @Author zhangzetao
 * @Date 2019/5/30 12:51
 * @Version 1.0
 **/
public class InvestAccount implements Model {
    @Override
    public void add() {
        System.out.println("账户属性新增方法");
    }

    @Override
    public void sub() {
        System.out.println("账户属性减少方法");
    }
}
