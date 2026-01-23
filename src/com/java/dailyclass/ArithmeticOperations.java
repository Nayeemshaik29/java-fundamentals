package com.java.dailyclass;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        byte a = sc.nextByte();
        byte b = sc.nextByte();
        short res =(short)(a+b);
        System.out.println(res);
        sc.close();

    }
}
