package com.java.interviewquestion;

import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Marks :");
        System.out.println("Enter Java Score = ");
        int javaMarks = sc.nextInt();
        System.out.println("Enter Spring Score = ");
        int springMarks = sc.nextInt();
        System.out.println("Enter SpringBoot Score = ");
        int springBootMarks = sc.nextInt();
        System.out.println("Enter Kafka Score = ");
        int kafkaMarks = sc.nextInt();
        System.out.println("Enter Docker Score = ");
        int dockerMarks = sc.nextInt();

        int sum =  javaMarks + springMarks + springBootMarks + kafkaMarks + dockerMarks;
        System.out.println("Sum of Student Marks : " + sum);
        float avg = (float) sum / 5;
        System.out.println("Average of Student Marks : " + avg);
    }
}
