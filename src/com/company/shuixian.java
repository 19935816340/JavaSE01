package com.example.demo;

import java.util.Scanner;

public class shuixian {
    public static void main(String[] args) {
        System.out.println("请输入一个三位数字：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = num % 10;
        int b = num / 10 % 10;
        int c = num / 100 % 10;
        if (num == a * a * a + b * b * b + c * c * c){
            System.out.println("它是水仙花数");
        }
        else{
            System.out.println("它不是水仙花数");
        }

    }
}
