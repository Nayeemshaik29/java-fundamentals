package com.java.dailyclass;

import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Marks :");

        System.out.print("Enter Java Score = ");
        int javaMarks = sc.nextInt();

        System.out.print("Enter Spring Score = ");
        int springMarks = sc.nextInt();

        System.out.print("Enter SpringBoot Score = ");
        int springBootMarks = sc.nextInt();

        System.out.print("Enter Kafka Score = ");
        int kafkaMarks = sc.nextInt();

        System.out.print("Enter Docker Score = ");
        int dockerMarks = sc.nextInt();

        int sum = javaMarks + springMarks + springBootMarks + kafkaMarks + dockerMarks;
        System.out.println("Sum of Student Marks : " + sum);

        float avg = sum / 5.0f;
        System.out.println("Average of Student Marks : " + avg);


        String grade;
        if (avg > 90) {
            grade = "A";
        } else if (avg >= 80) {
            grade = "B";
        } else if (avg >= 70) {
            grade = "C";
        } else if (avg >= 60) {
            grade = "D";
        } else {
            grade = "Fail";
        }

        System.out.println("Grade : " + grade);


        float cgpa = avg / 10;
        System.out.println("CGPA : " + cgpa);

        sc.close();
    }
}
