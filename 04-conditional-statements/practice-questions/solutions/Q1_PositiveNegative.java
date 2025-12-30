// Question 1: Check whether a number is positive, negative or zero
// This program takes an integer input from the user
// and prints whether it is Positive, Negative, or Zero.

import java.util.Scanner;

public class Q1_PositiveNegative {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter a number: ");
        int num = sc.nextInt();              // Read integer input

        // Check the number using if-else ladder
        if (num > 0) {
            System.out.println("Positive Number");
        } 
        else if (num < 0) {
            System.out.println("Negative Number");
        } 
        else {
            System.out.println("Number is Zero");
        }

        sc.close();   // Close Scanner (good practice)
    }
}

