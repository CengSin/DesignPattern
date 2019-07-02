package org.apache.myfaces.blank.template_pattern.simple;

/**
 * @author zhangzetao
 */
public abstract class AbstractClass {

    abstract void primitiveOperator1();

    abstract void primitiveOperator2();

    private void concreteOperator() {
        System.out.println("算法骨架");
    }

    public void templateMethod() {
        primitiveOperator1();
        concreteOperator();
        primitiveOperator2();
    }

}
