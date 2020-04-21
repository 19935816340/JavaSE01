package com.example.demo;

import java.util.Scanner;

public class zhipai {
    public static void main(String[] args) {
        System.out.println("请输入左手的纸牌数字：");
        System.out.println("请输入右手的纸牌数字：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("互换前左手的纸牌数是"+a);
        System.out.println("互换后右手的纸牌数是"+b);
        int c = b;
        b = a;
        System.out.println("互换后左手的纸牌数是"+c);
        System.out.println("互换后右手的纸牌数是"+a);
    }
}
