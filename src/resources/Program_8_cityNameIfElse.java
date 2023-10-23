package resources;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Program_8_cityNameIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Instantiate Scanner object
        System.out.println("Please enter a alphabet");
        String str = scanner.nextLine().toUpperCase(); //convert alphabet to upper case if provided in lower case
        char alphabet = str.charAt(0); //get the character using charAt method of the String
        findTheCityName(alphabet); //call the static method to find the corresponding city name
        scanner.close();//Close Scanner object
    }

    //static method to find the corresponding city name
    public static void findTheCityName(char alphabet) {
        if (alphabet == 'A') {
            System.out.println("City name is: Aberdeen");
        } else if (alphabet == 'B') {
            System.out.println("City name is: Belfast");
        } else if (alphabet == 'C') {
            System.out.println("City name is: Cambridge");
        } else if (alphabet == 'D') {
            System.out.println("City name is: Derby");
        } else if (alphabet == 'E') {
            System.out.println("City name is: Edinburgh");
        } else if (alphabet == 'F') {
            System.out.println("City name is: Farmoor");
        } else {
            System.out.println("Invalid entry!");
        }
    }
}
