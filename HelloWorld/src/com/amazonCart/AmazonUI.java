package com.amazonCart;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import  java.util.Scanner;


public class AmazonUI {

    public static void main(String[] args) {
        List <Product> products = new ArrayList<Product>();
        String name = null;
        double price;
        int quantity;
        int stock = 999;
        int a = 0;
        
        System.out.println("Welcome to Amazon!");

        Scanner scanner = new Scanner(System.in);
        String keepShopping = null;

        //Do...While Loop
       do {
           System.out.println("Enter the product name: ");
           name = scanner.nextLine().trim();

           System.out.println("Enter the unit price: ");
           price = scanner.nextDouble();

           System.out.println("Enter the quantity: ");
           quantity = scanner.nextShort();
           if (quantity > stock) {
               System.out.println("Out of stock");
               break;
           }
          else {
               System.out.println("Continue shopping (YES/NO): ");
               keepShopping = scanner.nextLine().trim();
               keepShopping = scanner.nextLine().trim();
           }
       }
       while (keepShopping.equalsIgnoreCase("YES")) ;

            System.out.println();
            double totalPrice = (price * quantity);
            String total = NumberFormat.getCurrencyInstance().format(totalPrice);

            System.out.println("Total: " + total);

    }
}


