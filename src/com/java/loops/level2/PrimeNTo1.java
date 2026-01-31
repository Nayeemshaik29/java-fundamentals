package com.java.loops.level2;

import java.util.Scanner;

public class PrimeNTo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 2;
        while (num <= n) {
            int count = 0;
            int i=1;
            while (i <= num){
                if(num%i == 0){
                    count++;
                }
                i++;
            }
            if(count==2){
                System.out.println(num);
            }
            num++;
        }
    }
}
