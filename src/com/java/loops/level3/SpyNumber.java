package com.java.loops.level3;

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int prod = 1;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            prod *= digit;
            num /= 10;
        }
        if (prod == sum) {
            System.out.println("Spy NUmber");
        }else{
            System.out.println("Not Spy NUmber");
        }
    }
}
