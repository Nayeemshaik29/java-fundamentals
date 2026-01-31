package com.java.loops.level2;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int i =2;
        while (i <= n) {
            if (n % i == 0) {
                count++;
            }
            i++;
        }
        if (count == 2) {
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }
    }
}
