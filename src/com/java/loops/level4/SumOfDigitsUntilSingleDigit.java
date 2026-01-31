package com.java.loops.level4;

import java.util.Scanner;

public class SumOfDigitsUntilSingleDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while (num >= 10) {
            sum = 0;
            while (num != 0) {

            int digit = num % 10;
            sum += digit;
            num /= 10;
            }
            num = sum;
        }
        System.out.println(num);

    }
}
