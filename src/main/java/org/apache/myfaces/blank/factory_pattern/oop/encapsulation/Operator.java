package org.apache.myfaces.blank.factory_pattern.oop.encapsulation;

/**
 * 封装业务，降低耦合度，使得代码更容易维护和拓展
 */

public class Operator {

    public static double getResult(double a, double b, String operator) {
        double result = 0L;

        switch (operator) {
            case "+":
                result = Double.valueOf(a) + Double.valueOf(b);
                break;
            case "-":
                result = Double.valueOf(a) - Double.valueOf(b);
                break;
            case "*":
                result = Double.valueOf(a) * Double.valueOf(b);
                break;
            case "/":
                result = Double.valueOf(a) / Double.valueOf(b);
                break;
        }

        return result;
    }

}
