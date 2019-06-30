package org.apache.myfaces.blank.simple_factory_pattern;

import java.util.Scanner;

public class calculator2 {

    public static void main(String[] args) {
        try {
            double result = 0;
            Scanner in = new Scanner(System.in);
            System.out.println("请输入数字A：");
            String aStrNumber = in.nextLine();
            System.out.println("请输入运算符：");
            String operation = in.nextLine();
            System.out.println("请输入数字B：");
            String bStrNumber = in.nextLine();

            switch (operation) {
                case "+":
                    result = Double.valueOf(aStrNumber) + Double.valueOf(bStrNumber);
                    break;
                case "-":
                    result = Double.valueOf(aStrNumber) - Double.valueOf(bStrNumber);
                    break;
                case "*":
                    result = Double.valueOf(aStrNumber) * Double.valueOf(bStrNumber);
                    break;
                case "/":
                    result = Double.valueOf(aStrNumber) / Double.valueOf(bStrNumber);
                    break;
            }

            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
