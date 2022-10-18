package com.hexfloo;

import java.util.Scanner;

public class operatorsPractice {
    /*
    // For Each loop
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Mango", "Orange"};

       for (String fruit : fruits) {
           System.out.println(fruit.toUpperCase());
       }
    } */

    /*
    // FizzBuzz
    public static void main(String[] args) {
        Scanner fizzbuzzScanner = new Scanner(System.in);
        System.out.print("Number: ");
        int inputNumber = fizzbuzzScanner.nextInt();

        if (inputNumber % 5 == 0 && inputNumber % 3 == 0) {
            System.out.println("FizzBuzz");
        } else if (inputNumber % 5 == 0) {
            System.out.print("Fizz");
        } else if (inputNumber % 3 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(inputNumber);
        }
    } */

    /*
    // Switch-Case statement
    public static void main(String[] args) {
        String role = "moderator";

        switch (role) {
            case "admin":
                System.out.println("Welcome Admin!");
                break;
            case "moderator":
                System.out.println("Welcome Moderator!");
                break;
            default:
                System.out.println("You are a guest");
        }
    } */

    /*
    // Command line args and ternary operator
    public static void main(String[] args) {
        int income = Integer.parseInt(args[0]);
        String hasHighIncome = income > 100_000 ? "high income" : "not high income";
        System.out.println(hasHighIncome);
    } */

    /*
    // Command line args
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        if (x < y) {
            System.out.println("x bigger than y");
        } else {
            System.out.println("y bigger than x");
        }
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + "\n");
        }
    } */
}
