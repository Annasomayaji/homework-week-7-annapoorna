package resources;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 *  HINT: use ternary operator (? : )
 */
public class Program_1_OddEven {
    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        Scanner scanner = new Scanner(System.in); //Instantiate Scanner object
        int number = scanner.nextInt();
        isOddOrEven(number);//call the static method into main
        scanner.close();//close the scanner object

    }

    //Static method to determine if the input number is odd or even
    public static void isOddOrEven(int number) {

        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number is " + result);
    }

}