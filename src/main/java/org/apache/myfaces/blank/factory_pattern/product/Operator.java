package org.apache.myfaces.blank.factory_pattern.product;

/**
 * @author zhangzetao
 */
public abstract class Operator {
    double a;
    double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    /**
     * 获取操作结果
     * @return 操作结果
     */
    public abstract double getResult();
}
