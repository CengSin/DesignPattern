package org.apache.myfaces.blank.template_pattern.simple;

/**
 * @author zhangzetao
 */
public class ConcreteOperator1 extends AbstractClass {

    @Override
    void primitiveOperator1() {
        System.out.println(this.getClass().getSimpleName() + "中的算法开始");
    }

    @Override
    void primitiveOperator2() {
        System.out.println(this.getClass().getSimpleName() + "中的算法结束");
    }
}
