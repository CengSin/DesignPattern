package org.apache.myfaces.blank.decorator_pattern.base.impl;

import org.apache.myfaces.blank.decorator_pattern.base.Component;

/**
 * @ClassName ConcreteComponent
 * @Description Component的实现类，动态的为此对象添加功能
 * @Author zhangzetao
 * @Date 2019/5/20 12:39
 * @Version 1.0
 **/
public class ConcreteComponent implements Component {

    @Override
    public void Operation() {
        System.out.println("具体操作--ConcreteComponent");
    }
}
