package org.apache.myfaces.blank.simple_factory_pattern;

import java.util.Scanner;

/**
 * 要求：实现一个计算机控制台程序，输入两个数和运算符，得到结果
 */

public class calculator1 {

    public static void main(String[] args) {

        double result = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入数字A：");
        String a = in.nextLine();
        System.out.println("请输入运算符：");
        String operation = in.nextLine();
        System.out.println("请输入数字B：");
        String b = in.nextLine();


        if (operation.equals("+")) {
            result = Double.valueOf(a) + Double.valueOf(b);
        }
        if (operation.equals("-")) {
            result = Double.valueOf(a) - Double.valueOf(b);
        }
        if (operation.equals("*")) {
            result = Double.valueOf(a) * Double.valueOf(b);
        }
        if (operation.equals("/")) {
            result = Double.valueOf(a) / Double.valueOf(b);
        }

        System.out.println(result);
    }

}
