package org.apache.myfaces.blank.simple_factory_pattern.oop.extends_and_polymorphism;

public class OperatorDiv extends Operator {

    @Override
    public double getResult() {
        return this.getA() / this.getB();
    }
}
