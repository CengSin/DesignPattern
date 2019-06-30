package org.apache.myfaces.blank.simple_factory_pattern.oop.extends_and_polymorphism;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("请输入数字A：");
            String aStrNumber = in.nextLine();
            System.out.println("请输入运算符：");
            String operation = in.nextLine();
            System.out.println("请输入数字B：");
            String bStrNumber = in.nextLine();
            Operator operator = OperatorFactory.createOperator(operation);
            operator.setA(Double.valueOf(aStrNumber));
            operator.setB(Double.valueOf(bStrNumber));
            System.out.println(operator.getResult());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
