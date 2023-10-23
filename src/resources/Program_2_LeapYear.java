package resources;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
public class Program_2_LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Instantiate Scanner object
        System.out.println("Please enter a year:");
        int year = scanner.nextInt();
        Program_2_LeapYear obj = new Program_2_LeapYear(); //object of the class
        obj.isLeapYear(year);//call instance method
        scanner.close();//close Scanner object
    }

    //Instance method declaration to determine leap year
    public void isLeapYear(int year) {
        //if the year is divisible by 4 and not a century year it is leap year
        //if th year is divisible by 4 , a century year and divisible by 400, it's a leap year
        //if a year is divisible by 4, a century year but not divisible by 400, it's not a leap year
        //if a year is not divisible by 4, it's not a leap year
        String result = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? "leap" : "not leap";
        System.out.println("The year is " + result + " year");
    }

}
