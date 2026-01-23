package com.java.dailyclass;

import java.util.Scanner;

public class ProductPrice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product Price : ");
        float productPrice = sc.nextFloat();
        System.out.print("Enter Discount (%) : ");
        float discount = sc.nextFloat();

        float centralTaxRate, stateTaxRate, discountAmount, discountedPrice, totalTax, finalPricePerItem, totalPrice, savedAmount;
        centralTaxRate = 2.5F;
        stateTaxRate = 2.5F;
        discountAmount = productPrice * discount / 100;
        discountedPrice = productPrice - discountAmount;
        totalTax = centralTaxRate + stateTaxRate;
        finalPricePerItem = discountedPrice + totalTax;
        System.out.println("Discount Amount per Item : " + discountAmount);
        System.out.println("Central Tax : " + centralTaxRate);
        System.out.println("State Tax   : " + stateTaxRate);
        System.out.println("Final Price per Item : " + finalPricePerItem);
        System.out.print("Enter Quantity : ");
        int quantity = sc.nextInt();
        totalPrice = finalPricePerItem * quantity;
        savedAmount = discountAmount * quantity;
        System.out.println("Total Price : " + totalPrice);
        System.out.println("You Saved : " + savedAmount);



        sc.close();
    }
}
