package org.apache.myfaces.blank.template_pattern.simple;

/**
 * @author zhangzetao
 */
public class ConcreteOperator2 extends AbstractClass {
    @Override
    void primitiveOperator1() {
        System.out.println(this.getClass().getSimpleName() + "算法开始");
    }

    @Override
    void primitiveOperator2() {
        System.out.println(this.getClass().getSimpleName() + "算法开始");
    }
}
