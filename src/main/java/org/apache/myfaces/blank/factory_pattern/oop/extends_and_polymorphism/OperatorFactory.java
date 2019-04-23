package org.apache.myfaces.blank.factory_pattern.oop.extends_and_polymorphism;

public class OperatorFactory {

    public static Operator createOperator(String operator) {
        Operator ope;

        switch (operator) {
            case "+":
                ope = new OperatorAdd();
                break;
            case "-":
                ope = new OperatorSub();
                break;
            case "*":
                ope = new OperatorDiv();
                break;
            case "/":
                ope = new OperatorSub();
                break;
            default:
                throw new RuntimeException("Operator not found!!!");
        }

        return ope;

    }

}
