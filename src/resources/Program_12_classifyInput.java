package resources;

import java.util.Scanner;

public class Program_12_classifyInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Instantiate Scanner object
        System.out.println("Enter a character, number or symbol");
        String input = scanner.nextLine();
        findInputType(input);
        //show(input);
        scanner.close();//close Scanner object
    }

    //call static method to evaluate the input
    public static void findInputType(String input) {
        if (input.matches("\\d+")) {
            System.out.println("Integer");
        } else if (input.matches("[A-Za-z]")) {
            System.out.println("character");
        } //else if (input.matches("+.+")) {
           // System.out.println("input is a string");
       // }
        else if (input.matches("[$%*,\"£~#@]")) {
            System.out.println("input is a symbol");
        }
    }
}
