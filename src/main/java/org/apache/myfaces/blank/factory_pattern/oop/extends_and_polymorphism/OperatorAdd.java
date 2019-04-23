package org.apache.myfaces.blank.factory_pattern.oop.extends_and_polymorphism;

public class OperatorAdd extends Operator {

    @Override
    public double getResult() {
        return this.getA() + this.getB();
    }
}
