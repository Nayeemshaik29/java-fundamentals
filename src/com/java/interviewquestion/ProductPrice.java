package com.java.interviewquestion;

import java.util.Scanner;

public class ProductPrice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product Price : ");
        float productPrice = sc.nextFloat();
        System.out.print("Enter Discount (%) : ");
        float discount = sc.nextFloat();

        float centralTaxRate = 2.5f;
        float stateTaxRate = 2.5f;
        float discountAmount = productPrice * discount / 100;
        float discountedPrice = productPrice - discountAmount;
        float totalTax = centralTaxRate + stateTaxRate;
        float finalPricePerItem = discountedPrice + totalTax;
        System.out.println("Discount Amount per Item : " + discountAmount);
        System.out.println("Central Tax : " + centralTaxRate);
        System.out.println("State Tax   : " + stateTaxRate);
        System.out.println("Final Price per Item : " + finalPricePerItem);
        System.out.print("Enter Quantity : ");
        int quantity = sc.nextInt();
        float totalPrice = finalPricePerItem * quantity;
        float savedAmount = discountAmount * quantity;
        System.out.println("Total Price : " + totalPrice);
        System.out.println("You Saved : " + savedAmount);


        sc.close();
    }
}
