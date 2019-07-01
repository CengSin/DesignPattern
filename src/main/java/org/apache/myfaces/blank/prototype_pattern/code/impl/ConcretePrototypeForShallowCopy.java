package org.apache.myfaces.blank.prototype_pattern.code.impl;

import org.apache.myfaces.blank.prototype_pattern.code.MyPrototype;
import org.apache.myfaces.blank.prototype_pattern.code.SubClass;

/**
 * @author zhangzetao
 */
public class ConcretePrototypeForShallowCopy extends MyPrototype implements Cloneable {

    private int a;

    private SubClass s;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public SubClass getS() {
        return s;
    }

    public void setS(SubClass s) {
        this.s = s;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototypeForShallowCopy c1 = new ConcretePrototypeForShallowCopy();
        c1.setA(1);
        c1.setS(new SubClass(1, 2));
        ConcretePrototypeForShallowCopy clone = (ConcretePrototypeForShallowCopy) c1.clone();
        System.out.println(c1);
        System.out.println(clone);

        System.out.println(c1 == clone);
        System.out.println(c1.equals(clone));

        System.out.println(c1.getClass().equals(clone.getClass()));

        /**
         * 修改Subclass判断 如果属性是对象的话，那么clone是深复制还是浅复制
         */

        clone.getS().setField1(2);

        /**
         * 修改clone对象的Subclass属性，也会“牵连”到c1，所有clone()方法只复制了c1.subClass属性的引用，是浅复制(shallow copy)
         */

        System.out.println(c1.getS().getField1());
        System.out.println(clone.getS().getField1());

    }

}
