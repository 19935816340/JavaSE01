package com.example.demo;

public class four {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1000;i <10000;i++){
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000;
            if (ge + bai == shi + qian){
                count++;
                if (count % 5 == 0){
                    System.out.println(i);
                }else {
                    System.out.print(i+" ");
                }
            }
        }
        System.out.println("满足条件的数字有"+count+"个");
    }
}
