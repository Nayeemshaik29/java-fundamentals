package com.java.dailyclass;

import java.util.Scanner;

public class ProductPriceForMemberShipSwitch {
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
        int discountPercentage = 0;


        switch (membership) {
            case 'S':
                discountPercentage = 10;
                shippingCharges = 50;
                break;

            case 'G':
                discountPercentage = 15;
                shippingCharges = 20;
                break;

            case 'D':
                discountPercentage = 20;
                shippingCharges = 0;
                break;

            default:
                System.out.println("Invalid Membership Code!");
                shippingCharges = 100;
        }

        discountAmount = productPrice * discountPercentage / 100;
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
