package resources;

import java.util.Scanner;

/**
 * Write a method isLeapYear with a parameter of type int named year
 */
public class Program_4_NoOfDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Instantiate scanner object
        System.out.println("Please enter a year");
        int year = scanner.nextInt();
        //call method to check for leap year
        boolean yearType = isLeapYear(year);
        //Print result if year leap 'true' or 'false'
        System.out.println("The year is a leap year:");
        System.out.println("\"" + yearType + "\"");
        System.out.println("");
        //method to check the days in a month
        System.out.println("Please enter a month number");//request a month number from user
        int month = scanner.nextInt();//read it and store it in month variable
        System.out.println("Please enter a year");//Request a year from the user
        int year2 = scanner.nextInt();
        //call method to get days in a month
        int daysInMonth = getDaysInMonth(month, year2);//pass month number and year to the method to calculate days in that month
        //if the input boundaries are not valid print '-1 invalid input'
        if (daysInMonth == -1) {
            System.out.println(daysInMonth +" invalid input! Try again");
        } else {
            System.out.println("The month " + month + " has " + daysInMonth + " days.");
        }
        scanner.close();//close scanner object
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        }

    }

    public static int getDaysInMonth(int month, int year) {
        int daysInMonth = 0;
        if (month < 1 || month > 12) {
            daysInMonth = -1;
        } else if (year < 1 || year > 9999) {
            daysInMonth = -1;
        } else {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    daysInMonth = 31;
                    break;
                case 2:
                    if (isLeapYear(year))
                        daysInMonth = 29;
                    else
                        daysInMonth = 28;
                    break;
                case 4, 6, 9, 11:
                    daysInMonth = 30;
                    break;
            }

        }
        return daysInMonth;
    }


}
