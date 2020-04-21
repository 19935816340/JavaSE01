package com.example.demo;

import org.aspectj.weaver.tools.ISupportsMessageContext;

import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        System.out.println("请输入一个除100之外的三位数数字：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 100;i <= num;i++){
            if (i % 10 != 7 && i / 10 % 10 !=5 && i /100 != 3){
                sum = sum + i;
            }
        }
        System.out.println("所有满足条件的数字之和为："+sum);
    }
}
