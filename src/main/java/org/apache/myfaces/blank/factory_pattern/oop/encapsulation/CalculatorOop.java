package org.apache.myfaces.blank.factory_pattern.oop.encapsulation;

import java.util.Scanner;

public class CalculatorOop {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("请输入数字A：");
            String aStrNumber = in.nextLine();
            System.out.println("请输入运算符：");
            String operation = in.nextLine();
            System.out.println("请输入数字B：");
            String bStrNumber = in.nextLine();
            double result = Operator.getResult(Double.valueOf(aStrNumber), Double.valueOf(bStrNumber), operation);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
