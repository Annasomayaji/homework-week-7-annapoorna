package resources;

import java.util.Scanner;

/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Program_10_ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Instantiate Scanner object
        System.out.println("Please enter 2 numbers and the arithmetic operator");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.nextLine();//to read the next line \n that is after the nextInt() call where the cursor is
        String operator = scanner.nextLine();
        Program_10_ArithmeticOperations obj = new Program_10_ArithmeticOperations();//create object of the class
        obj.performArithmeticOperation(num1, num2, operator);
        scanner.close();//Close Scanner object
    }

    //Instance method to perform the arithmetic operations
    public void performArithmeticOperation(int num1, int num2, String operator) {
        float result;
        if (operator.equals("+")) { //String equals() method
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
        } else if(operator.equals("/")) {
            if (num1 > num2) { //divide larger number by smaller
                result = num1 / num2;
            } else {
                result = num2 / num1;
            }
        }else {
            System.out.println("Invalid operator!");
            result = 0;
        }
        System.out.println("The result of the requested operation is: "+result);
    }
}
