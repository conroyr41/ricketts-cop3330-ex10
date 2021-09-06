/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Conroy Ricketts
 */

import java.util.Scanner;

public class app
{
    public static void main(String[] args)
    {
        Scanner scan;
        int numItems = 3;
        final double taxRatePercent = 5.5;
        double subTotal = 0;
        double tax, total;
        String output;

        float prices[] = new float[numItems];
        float quantities[] = new float[numItems];

        for(int i = 0; i < numItems; i++)
        {
            System.out.println(String.format("Enter the price of item %d:", i + 1));
            scan = new Scanner(System.in);
            prices[i] = Float.parseFloat(scan.next());

            System.out.println(String.format("Enter the quantity of item %d:", i + 1));
            scan = new Scanner(System.in);
            quantities[i] = Float.parseFloat(scan.next());
        }

        for(int i = 0; i < numItems; i++)
            subTotal += prices[i] * quantities[i];

        tax = subTotal * (taxRatePercent / 100);
        total = subTotal + tax;
        output = String.format("\nConroy's Grocery Store RECEIPT\n--------------------------------\nSubtotal: $%.2f\nTax: $%.2f\n--------------------------------\nTotal: $%.2f", subTotal, tax, total);

        System.out.println(output);
    }
}
