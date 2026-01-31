package com.java.loops.level4;

import java.util.Scanner;

public class ProductOfDigitsIsOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 1;

        while (num <= n) {
            int temp = num;
            int product = 1;

            while (temp != 0) {
                int digit = temp % 10;
                product *= digit;
                temp /= 10;
            }

            if (product % 2 != 0) {
                System.out.println(num);
            }

            num++; // always increment
        }
    }
}
