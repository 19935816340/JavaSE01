package com.example.demo;

import java.util.Scanner;

public class xiaoming {
    public static void main(String[] args) {
        System.out.println("你觉得小明的成绩是：");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score >=0 && score<=100)
        switch(score/10){
            case 10:
            case 9:
                System.out.println("奖励山地自行车");
            case 8:
                System.out.println("奖励游乐场");
            case 7:
                System.out.println("奖励变形金刚");
            default:
                System.out.println("奖励胖揍一顿");
                break;
            }
        else{
            System.out.println("输入错误");

        }


    }
}
