package com.java.interviewquestion;

import java.util.Scanner;

public class EmployeeSalaryFromCTC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Annual Package (CTC in LPA): ");
        float ctcLPA = sc.nextFloat();


        float annualCTC = ctcLPA * 100000;


        float basicSalary = annualCTC * 40 / 100;   // 40% basic
        float pf = basicSalary * 12 / 100;          // 12% PF
        float tax = annualCTC * 10 / 100;            // 10% Tax (assumed)

        float totalDeduction = pf + tax;
        float annualInHand = annualCTC - totalDeduction;
        float monthlyInHand = annualInHand / 12;


        System.out.println("\n------ Salary Breakdown ------");
        System.out.println("Annual CTC        : " + annualCTC);
        System.out.println("Basic Salary      : " + basicSalary);
        System.out.println("PF Deduction      : " + pf);
        System.out.println("Tax Deduction     : " + tax);
        System.out.println("------------------------------");
        System.out.println("Annual In-hand    : " + annualInHand);
        System.out.println("Monthly In-hand   : " + monthlyInHand);

        sc.close();
    }

}
