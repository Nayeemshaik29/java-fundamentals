package com.java.loops.level2;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum = sum + (rem * rem * rem);
            n = n / 10;
        }
        if(sum == n){
            System.out.println("Armstrong Number");
        }else {
            System.out.println("Not Armstrong Number");
        }

    }
}
