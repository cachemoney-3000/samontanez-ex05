/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Samontanez
 */


package exercise05;

import java.util.Scanner;

public class Solution05 {
    /*
    Create a simple math program
    print "What is the first number"
    scanner scans the first input,
    'first' = stores the first number.
    print "What is the second number"
    scanner scans the second input,
    'second' = stores the second number.
    'sum' = stores int sum of 2 numbers,
    'diff' = stores int difference of 2 numbers,
    'product' = stores int product of 2 numbers,
    'quotient' = stores int quotient of 2 numbers,
    print "<first> + <second> = <sum>
    newline <first> + <second> = <diff>
    newline <first> + <second> = <product>
    newline <first> + <second> = <quotient>"
     */

    public static void main(String[] args) {
        System.out.print("What is the first number: ");
        Scanner num1 = new Scanner(System.in);
        int first = num1.nextInt();
        double fir = first;

        System.out.print("What is the second number: ");
        Scanner num2 = new Scanner(System.in);
        int second = num2.nextInt();
        double sec = second;

        int sum = first + second;
        int diff = first - second;
        int product = first * second;
        double quotient = fir / sec;

        System.out.println(first + " + " + second + " = " + sum +
                "\n" + first + " - " + second + " = " + diff +
                "\n" + first + " * " + second + " = " + product +
                "\n" + first + " / " + second + " = " + quotient);
    }
}