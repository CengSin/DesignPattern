package org.apache.myfaces.blank.prototype_pattern;

import java.io.Serializable;

/**
 * 子属性也要实现序列化接口，已实现深复制
 */
public class SubClassForDeepCopy implements Serializable {

    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public SubClassForDeepCopy() {
    }

    public SubClassForDeepCopy(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
