package com.java.loops.level3;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0, b = 1;

        if (n >= 1) {
            System.out.print(a + " ");
        }
        if (n >= 2) {
            System.out.print(b + " ");
        }

        int i = 3;
        while (i <= n) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            i++;
        }
    }
}
