package com.supermarket;

import java.util.Scanner;

public class supermarket {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

        // Askthe cashier how many items were bought
        System.out.print("Enter the number of different items: ");
        int n = input.nextInt();

        // Arrays to store details
        String[] itemNames = new String[n];
        double[] prices = new double[n];
        int[] quantities = new int[n];
        double[] subtotals = new double[n];
        double totalBill = 0;

        // 2. Use a for loop to collect details of each item
        for (int i = 0; i < n; i++) {
            System.out.println("\nItem " + (i + 1));

            System.out.print("Enter item name: ");
            itemNames[i] = input.next();

            System.out.print("Enter price per unit: ");
            prices[i] = input.nextDouble();

            System.out.print("Enter quantity: ");
            quantities[i] = input.nextInt();

            // 3. find subtotal for this item
            subtotals[i] = prices[i] * quantities[i];
            totalBill += subtotals[i]; // add to grand total
        }

        // 4. control discount
        double discount = 0;
        if (totalBill > 40000) {
            discount = totalBill * 0.04; // 5% discount
        }
        double finalAmount = totalBill - discount;

        // 5. display the receipt
        System.out.println("\n========= RECEIPT =========");
        System.out.println("Item\tQty\tPrice\tSubtotal");
        for (int i = 0; i < n; i++) {
            System.out.println(itemNames[i] + "\t" + quantities[i] + "\t" +
                               prices[i] + "\t" + subtotals[i]);
        }
        System.out.println("---------------------------");
        System.out.println("Total before discount: " + totalBill);
        System.out.println("Discount: " + discount);
        System.out.println("Final amount to pay: " + finalAmount);
        System.out.println("===========================");
    }
}
		
	

