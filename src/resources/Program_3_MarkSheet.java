package resources;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet
 */

public class Program_3_MarkSheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Instantiate scanner object
        System.out.println("Enter student name:");
        String studentName = scanner.nextLine();
        System.out.println("Enter roll number:");
        int rollNumber = scanner.nextInt();
        System.out.println("Enter marks in Maths:");
        int marksMaths = scanner.nextInt();
        System.out.println("Enter marks in Science:");
        int marksScience = scanner.nextInt();
        System.out.println("Enter marks in English:");
        int marksEnglish = scanner.nextInt();
        //call method to create mark sheet that takes 5 parameters
        createMarksSheet(studentName, rollNumber, marksMaths, marksScience, marksEnglish);
        scanner.close(); //close Scanner object
    }


    /**
     * Below is the method to print the mark sheet
     * It call sub methods to calculate total marks, percentage, Pass/Fail and grade
     * Then prints out the result of all the methods combined
     */

    public static void createMarksSheet(
            String studentName,
            int rollNumber,
            int marksMaths,
            int marksScience,
            int marksEnglish) {
        int total = 0;
        float percentage, percent = 0;
        String result = "", grade = "";
        if ((marksMaths < 0 || marksMaths > 100)  //if condition to check out of bound marks
                || (marksEnglish < 0 || marksEnglish > 100)
                || (marksScience < 0 || marksScience > 100)) {
            System.out.println("Invalid Input, Marks should between 0 to 100");

        } else {
            total = calculateTotal(marksMaths, marksScience, marksEnglish); //call method with return type to calculate total
            // System.out.println(total);
            int maxTotal = 300;
            percentage = calculatePercentage(total, maxTotal);//call method with return type to calculate percentage
            percent = Math.round(percentage * 100) / 100;
            //System.out.println(percentage);
            result = ifPassOrFail(percentage); //Call method to determine Pass or Fail cased on percentage
            // System.out.println(result);
            grade = calculateGrade(percentage);//call method to calculate grade
            //  System.out.println(grade);

            System.out.println("------------------------------");
            System.out.println("|                             |");
            System.out.println("|         Mark Sheet          |");
            System.out.println("|                             |");
            System.out.println("|-----------------------------|");
            System.out.println("|    Name   :" + studentName + "             |");
            System.out.println("|   Roll No:" + rollNumber + "                |");
            System.out.println("|-----------------------------|");
            System.out.println("|   Subjects    |      Marks  |");
            System.out.println("|   Maths       :" + marksMaths + "           |");
            System.out.println("|   Science     :" + marksScience + "           |");
            System.out.println("|  English      :" + marksEnglish + "           |");
            System.out.println("|-----------------------------|");
            System.out.println("|    Total       :   " + total + "      |");
            System.out.println("|   Percentage  :   " + percent + "      |");
            System.out.println("|   Result      :   " + result + "      |");
            System.out.println("|   Grade       :   " + grade + "         |");
            System.out.println("|-----------------------------|");

        }
    }

    //method to calculate total marks
    public static int calculateTotal(int mathsMarks, int scienceMarks, int englishMarks) {
        return (mathsMarks + scienceMarks + englishMarks);
    }

    //method to calculate percentage
    public static float calculatePercentage(int total, int maxTotal) {

        return (float) (100 * total) / maxTotal;
    }

    //method to determine result
    public static String ifPassOrFail(float percentage) {
        return (percentage >= 35 ? "Pass" : "Fail");
    }

    //method to calculate grade
    public static String calculateGrade(float percentage) {
        String grade = "";
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage < 80 && percentage >= 60) {
            grade = "A";
        } else if (percentage < 60 && percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        }
        return grade;
    }

}
