package com.java.loops.level4;

import java.util.Scanner;

public class SumOfDigitsIsEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // how many numbers to print

        int num = 1;
        int count = 0;

        while (count < n) {
            int temp = num;
            int sum = 0;

            while (temp != 0) {
                int digit = temp % 10;
                sum += digit;
                temp /= 10;
            }

            if (sum % 2 == 0) {
                System.out.println(num);
                count++;
            }

            num++; // must increment every time
        }
    }
}
