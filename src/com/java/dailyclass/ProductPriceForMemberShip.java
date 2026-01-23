package com.java.dailyclass;

import java.util.Scanner;

public class ProductPriceForMemberShip {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product Price : ");
        float productPrice = sc.nextFloat();

        System.out.print("Enter Membership Code (S/G/D): ");
        char membership = Character.toUpperCase(sc.next().charAt(0));

        float centralTaxRate = 2.5F;
        float stateTaxRate = 2.5F;
        float discountAmount = 0;
        int shippingCharges = 0;
        int discountPercentage;

        if (membership == 'S') {
            discountPercentage = 10;
            discountAmount = productPrice * discountPercentage / 100;
            shippingCharges = 50;
        } else if (membership == 'G') {
            discountPercentage = 15;
            discountAmount = productPrice * discountPercentage / 100;
            shippingCharges = 20;
        } else if (membership == 'D') {
            discountPercentage = 20;
            discountAmount = productPrice * discountPercentage / 100;
            shippingCharges = 0;
        } else {
            shippingCharges = 100;
        }

        float discountedPrice = productPrice - discountAmount;


        float centralTax = discountedPrice * centralTaxRate / 100;
        float stateTax = discountedPrice * stateTaxRate / 100;

        float finalPricePerItem = discountedPrice + centralTax + stateTax;

        System.out.println("Discount per Item : " + discountAmount);
        System.out.println("Central Tax : " + centralTax);
        System.out.println("State Tax   : " + stateTax);
        System.out.println("Final Price per Item : " + finalPricePerItem);

        System.out.print("Enter Quantity : ");
        int quantity = sc.nextInt();

        float totalPrice = (finalPricePerItem * quantity) + shippingCharges;
        float savedAmount = discountAmount * quantity;

        System.out.println("Shipping Charges : " + shippingCharges);
        System.out.println("Total Price : " + totalPrice);
        System.out.println("You Saved : " + savedAmount);

        sc.close();
    }
}
