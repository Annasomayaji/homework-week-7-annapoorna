package resources;

import java.util.Scanner;

/**
 * Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */

public class Program_13_DaysOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Instantiate Scanner object
        System.out.println("Please enter a number of a week");
        int weekday = scanner.nextInt();
        findDayOfWeek(weekday); //method to find the day of the week
        scanner.close();//close Scanner object
    }

    //static method to find the day of the week
    public static void findDayOfWeek(int weekday) {
        String day;
        switch (weekday) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "wrong. Week contains 1 to 7 days.";
                break;
        }
        System.out.println("The day you entered is " + day);
    }
}
