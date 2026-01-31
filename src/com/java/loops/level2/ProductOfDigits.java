package com.java.loops.level2;

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prod = 1;
        while (n != 0) {
            int digit = n % 10;
            prod *= digit;
            n = n / 10;

        }
        System.out.println(prod);
    }
}
