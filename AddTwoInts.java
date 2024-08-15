// This is a comment
/*
/* Cher Vang
* 8/15/24
* AddTwoInts. java
 */

import java.util.Random;
import java.util.Scanner; // Import the Scanner class


public class AddTwoInts {
    public static void main(String[] args) {
        System.out.println(" \n\n Welcome to the Double Int Program !\n\n");

        int firstNum = 0;
        int secondNum = 0;
        int sumOfBothNumbers = 0;

        System.out.println("\n The Valve of sumOfBothNumbers is " + sumOfBothNumbers);

        // Create a Scanner Object
        Scanner myScannerObject = new Scanner(System.in);

        // Ask user for the first int
        System.out.println("\n Please enter a whole number: ");
        firstNum = myScannerObject.nextInt();

        // Unit test for our first user input
        System.out.println("\n The valve of firstNum is: " + firstNum);

        // Ask user for the second int
        System.out.println("\n Please enter a second whole number: ");
        secondNum = myScannerObject.nextInt();

        // Unit test for our second user input.
        System.out.println("\n The valve of secondNum is: " + secondNum);

        // Processing
        // Add the two ints input from the user.
        // the total of firstNum and secondNum will be stored in
        // the variable named: sumofBothNumbers

        sumOfBothNumbers = firstNum + secondNum;

        // Output the value of the variable named: sumOfBothNumbers
        System.out.println("\n The value sum of sumOfBothNumbers is: " + sumOfBothNumbers);


    }
}