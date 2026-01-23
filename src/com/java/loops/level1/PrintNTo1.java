package com.java.loops.level1;

import java.util.Scanner;

public class PrintNTo1 {
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            int n =sc.nextInt();
            int sum = 0;
            for (int i = n; i > 0; i--) {
                sum+=i;
            }
            System.out.println(sum);
        }
    }
}
