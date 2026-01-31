package com.java.loops.level3;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp  = n;
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            int fact = 1;
            int i = 1;
            while(i <= digit){
                fact = fact * i;
                i++;
            }
            sum += fact;
            n /= 10;

        }
        if (sum == temp) {
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not Strong number");
        }
    }
}
