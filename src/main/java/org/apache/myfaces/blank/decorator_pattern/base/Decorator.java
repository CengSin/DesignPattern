package org.apache.myfaces.blank.decorator_pattern.base;

/**
 * @ClassName Decorator
 * @Description Decorator，装饰类，继承了Component，从外类来拓展Component的功能。对于COmponent来说，
 * 不需要知道Decorator的存在
 * @Author zhangzetao
 * @Date 2019/5/20 12:39
 * @Version 1.0
 **/
public class Decorator implements Component {

    private Component component = null;

    public void setComponent(Component component) {
        this.component = component;
    }


    @Override
    public void Operation() {
        if (component != null) {
            component.Operation();
        }
    }
}
