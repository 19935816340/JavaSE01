package com.example.demo;

import com.sun.corba.se.impl.orb.ParserTable;

public class six {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 6 != 0) {
                if (i < 10) {
                    System.out.print(i+" ");
                    System.out.print(" ");
                    System.out.print(" ");}
            else if (i >= 10 && i < 100) {
                System.out.print(i);
                System.out.print(" ");
                System.out.print(" ");
            }
            else if (i == 100){
                System.out.print(i + " ");
            }
            }else {
                System.out.println(i);
            }
        }

    }

}
