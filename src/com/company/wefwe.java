package com.example.demo;
import java.util.Scanner;

public class wefwe {
    public static void main(String[] args) {
        System.out.println("请输入一个1-7的数字");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >=1 && num <= 7){
            if (num == 1){
                System.out.println("星期一");
            }
            else if (num == 2){
                System.out.println("星期二");
            }
            else if (num == 3){
                System.out.println("星期三");
            }
            else if (num == 4){
                System.out.println("星期四");
            }
            else if (num == 5){
                System.out.println("星期五");
            }
            else if (num == 6){
                System.out.println("星期六");
            }
            else if (num == 7){
                System.out.println("星期日");
            }
        }
        else {
                System.out.println("没有这样的日期");
            }
        }

    }
