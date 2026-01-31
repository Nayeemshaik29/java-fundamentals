package com.java.dailyclass;

import java.util.Scanner;

public class STClothingShop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Hard-coded stock
        int availableStock = 50;

        char continueShopping;

        do {
            System.out.println("\nWelcome ST Clothing");
            System.out.println("1. Products");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nAvailable Socks Quantity: " + availableStock);

                    if (availableStock <= 0) {
                        System.out.println("Sorry! Product is out of stock.");
                        break;
                    }

                    System.out.print("Enter Product Price: ");
                    float productPrice = sc.nextFloat();

                    System.out.print("Enter Membership Code (S/G/D): ");
                    char membership = Character.toUpperCase(sc.next().charAt(0));

                    float centralTaxRate = 2.5f;
                    float stateTaxRate = 2.5f;

                    int discountPercentage = 0;
                    int shippingCharges = 0;

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
                            discountPercentage = 0;
                            shippingCharges = 100;
                    }

                    float discountAmount = productPrice * discountPercentage / 100;
                    float discountedPrice = productPrice - discountAmount;

                    float centralTax = discountedPrice * centralTaxRate / 100;
                    float stateTax = discountedPrice * stateTaxRate / 100;

                    float finalPricePerItem = discountedPrice + centralTax + stateTax;

                    System.out.println("\n--- Billing Details ---");
                    System.out.println("Discount per Item : " + discountAmount);
                    System.out.println("Central Tax       : " + centralTax);
                    System.out.println("State Tax         : " + stateTax);
                    System.out.println("Final Price/Item  : " + finalPricePerItem);

                    System.out.print("\nEnter Quantity: ");
                    int quantity = sc.nextInt();

                    if (quantity > availableStock) {
                        System.out.println(
                                "You can only buy " + availableStock + " quantity right now.");
                        break;
                    }

                    // Reduce stock
                    availableStock = availableStock - quantity;

                    float totalPrice = (finalPricePerItem * quantity) + shippingCharges;
                    float savedAmount = discountAmount * quantity;

                    System.out.println("\nShipping Charges : " + shippingCharges);
                    System.out.println("Total Price      : " + totalPrice);
                    System.out.println("You Saved        : " + savedAmount);

                    break;

                case 2:
                    System.out.println("Thank you for visiting ST Clothing!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }

            System.out.print("\nDo you want to continue shopping? (y/n): ");
            continueShopping = sc.next().toLowerCase().charAt(0);

        } while (continueShopping == 'y');

        System.out.println("Thank you for shopping with ST Clothing!");
        sc.close();
    }
}
