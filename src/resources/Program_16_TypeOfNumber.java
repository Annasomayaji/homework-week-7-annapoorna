package resources;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Program_16_TypeOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Instantiating Scanner object
        System.out.println("Please enter a number");
        float number = scanner.nextFloat(); //read the number from console
        findTypeOfNumber(number);//call the static method to find the type of the number
        scanner.close();
    }

    public static void findTypeOfNumber(float number) {
        //check the type of the number based on if it is greater than or smaller than 0
        if (number > 0) {
            System.out.println("It is a positive number");
        } else if (number < 0) {
            System.out.println("It is a negative number");
        } else {
            System.out.println("The number you entered is zero");
        }
    }
}
