package resources;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Program_6_OddEven2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Instantiate Scanner object
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        //call the static method created in 'another class' (Program_1_OddEven)
        // using Class name
        Program_1_OddEven.isOddOrEven(number);
        scanner.close();//Close Scanner object
    }
}
