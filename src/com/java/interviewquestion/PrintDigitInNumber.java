package com.java.interviewquestion;

import java.util.Scanner;

public class PrintDigitInNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev = 0;


        while (n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }


        while (rev != 0) {
            System.out.println(rev % 10);
            rev = rev / 10;
        }
    }
}
