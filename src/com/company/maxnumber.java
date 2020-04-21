package com.example.demo;

import java.util.Scanner;

public class maxnumber {
    public static void main(String[] args) {
        System.out.println("请输入三个不相等的整数：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>b && a>c){
            System.out.println("最大值为"+a);
            }
        else if (b>a && b>c) {
            System.out.println("最大值为" + b);
        }
         else if (c>a && c>b){
                System.out.println("最大值为"+c);
        }
        }
}
