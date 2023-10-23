package resources;

import java.util.Scanner;

public class Program_9_CityNameSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Instantiate Scanner object
        System.out.println("Please enter a alphabet");
        String str = scanner.nextLine().toUpperCase(); //convert alphabet to upper case if provided in lower case
        char alphabet = str.charAt(0); //get the character using charAt method of the String
        findCityName(alphabet); //call the static method to find the corresponding city name
        scanner.close();//Close Scanner object
    }

    public static void findCityName(char alphabet) {
        switch (alphabet) {
            case 'A':
                System.out.println("City name is: Aberdeen");
                break;
            case 'B':
                System.out.println("City name is: Belfast");
                break;
            case 'C':
                System.out.println("City name is: Cambridge");
                break;
            case 'D':
                System.out.println("City name is: Derby");
                break;
            case 'E':
                System.out.println("City name is: Edinburgh");
                break;
            case 'F':
                System.out.println("City name is: Farmoor");
                break;
            default:
                System.out.println("Invalid entry!");
                break;

        }
    }
}
