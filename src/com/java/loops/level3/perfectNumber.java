package com.java.loops.level3;

import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i < n) {
            if (n % i == 0) {
                sum += i;
            }
            i++;
        }
        if (sum == n) {
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not Perfect Number");
        }
    }
}
