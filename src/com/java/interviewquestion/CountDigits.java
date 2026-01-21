package com.java.interviewquestion;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        while(n!=0){
            count+=n%10;
            n=n/10;
        }
        System.out.println(count);
    }
}
