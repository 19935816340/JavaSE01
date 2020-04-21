package com.example.demo;

import java.util.Scanner;

public class jisuanqi {
    public static void main(String[] args) {
        System.out.println("请输入第一个整数：");
        System.out.println("请输入第二个整数：");
        System.out.println("请输入第三个整数：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (c >= 0 && c <= 3) {
            if (c == 0) {
                int d = a + b;
                System.out.println(a+"+"+b+"="+d);
            }
            if (c == 1) {
                int d = a - b;
                System.out.println(a+"-"+b+"="+d);
            }
            if (c == 2) {
                int d = a * b;
                System.out.println(a+"*"+b+"="+d);
            }
            if (c == 3) {
                int d = a / b;
                System.out.println(a+"/"+b+"="+d);
            }
        }
    }
}

