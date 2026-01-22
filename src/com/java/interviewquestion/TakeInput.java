package com.java.interviewquestion;

import java.util.Scanner;

public class TakeInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter phone charge (byte): ");
        byte phoneCharge = sc.nextByte();


        System.out.print("Enter daily steps (short): ");
        short dailySteps = sc.nextShort();


        System.out.print("Enter city pincode (int): ");
        int cityPincode = sc.nextInt();


        System.out.print("Enter world population (long): ");
        long worldPopulation = sc.nextLong();


        System.out.print("Enter body weight (float): ");
        float bodyWeight = sc.nextFloat();


        System.out.print("Enter bank interest rate (double): ");
        double interestRate = sc.nextDouble();


        System.out.print("Enter grade (char): ");
        char grade = sc.next().charAt(0);


        System.out.print("Is Java easy? (true/false): ");
        boolean isJavaEasy = sc.nextBoolean();


        System.out.println("\n----- OUTPUT -----");
        System.out.println("Phone Charge : " + phoneCharge);
        System.out.println("Daily Steps : " + dailySteps);
        System.out.println("City Pincode : " + cityPincode);
        System.out.println("World Population : " + worldPopulation);
        System.out.println("Body Weight : " + bodyWeight);
        System.out.println("Interest Rate : " + interestRate);
        System.out.println("Grade : " + grade);
        System.out.println("Is Java Easy : " + isJavaEasy);

        sc.close();
    }
}
