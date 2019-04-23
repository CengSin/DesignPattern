package org.apache.myfaces.blank.factory_pattern.oop.extends_and_polymorphism;

public class Operator {

    private double a;
    private double b;
    private double result;

    public Operator() {
    }

    public Operator(double a, double b, double result) {
        this.a = a;
        this.b = b;
        this.result = result;
    }

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

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
