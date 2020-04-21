package com.example.demo;

import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        System.out.println("请顺序输入您的工龄和基本工资：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a >=0 && a < 15) {
            if (a >= 10) {
                int c = 5000;
                int d = b + c;
                System.out.println("您目前工作了"+a+"年，基本工资为" +b+ ",应涨工资为" +c+ "，涨后工资为"+d);
            }
             else if (a >= 5) {
                int c = 2500;
                int d = b + c;
                System.out.println("您目前工作了"+a+"年，基本工资为" +b+ ",应涨工资为" +c+ "，涨后工资为"+d);
            }
            else if (a >= 3) {
                int c = 1000;
                int d = b + c;
                System.out.println("您目前工作了"+a+"年，基本工资为" +b+ ",应涨工资为" +c+ "，涨后工资为"+d);
            }
            else if (a >= 1) {
                int c = 500;
                int d = b + c;
                System.out.println("您目前工作了"+a+"年，基本工资为" +b+ ",应涨工资为" +c+ "，涨后工资为"+d);
            }
            else{
                int c = 200;
                int d = b + c;
                System.out.println("您目前工作了"+a+"年，基本工资为"+b+",应涨工资为" +c+ "，涨后工资为"+d);
            }
        }
    }
}
