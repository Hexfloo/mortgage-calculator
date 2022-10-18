package com.hexfloo;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principalAmount;
        float annualInterest;
        byte years;
        int numOfPayments;

        // Set up scanner
        Scanner mortgageScanner = new Scanner(System.in);

        // Get Principal amount
        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            principalAmount = mortgageScanner.nextInt();
            if (principalAmount >= 1_000 && principalAmount <= 1_000_000) {
                break;
            } else if (principalAmount < 1_000 || principalAmount > 1_000_000) {
                System.out.println("Must be a number between 1,000 and 1,000,000");
            }
        }

        // Get interest rate and calculate monthly interest
        while (true) {
            System.out.print("Annual Interest Rate (%): ");
            annualInterest = mortgageScanner.nextFloat();
            if (annualInterest >= 0 && annualInterest <= 30) {
                break;
            } else if (annualInterest < 0 || annualInterest > 30) {
                System.out.println("Enter a value between 0 and 30");
            }
        }
        float monthlyInterestPercent = annualInterest / PERCENT / MONTHS_IN_YEAR;

        // Get period in years
        while (true) {
            System.out.print("Period (Years): ");
            years = mortgageScanner.nextByte();
            if (years >= 1 && years <= 30) {
                numOfPayments = years * MONTHS_IN_YEAR;
                break;
            } else if (years < 1 || years > 30) {
                System.out.println("Enter a value between 1 and 30");
            }
        }

        // Calculating mortgage
        double interestPowed = Math.pow((1+monthlyInterestPercent), numOfPayments);
        double mortgage = principalAmount
                * ((monthlyInterestPercent * interestPowed)
                / (interestPowed - 1));

        // Format to currency
        String result = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + result);
    }
}



