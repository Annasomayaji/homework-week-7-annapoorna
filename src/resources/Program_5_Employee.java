package resources;

import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 */
public class Program_5_Employee {
    public static void main(String[] args) {
        //declare variables to store input
        int id, basicSalary;
        String employeeName;
        Scanner scanner = new Scanner(System.in);//instantiate Scanner object
        System.out.println("Please enter ID, employee name, and salary");
        id = scanner.nextInt();
        scanner.nextLine();
        employeeName = scanner.nextLine();
        basicSalary = scanner.nextInt();
        //call the method to print Salary slip
        printSalarySlip(id, employeeName, basicSalary);
        scanner.close();//close scanner object
    }

    //Method to print salary slip
    public static void printSalarySlip(int id, String employeeName, int basicSalary) {
        float hra = (float) (basicSalary * 10) / 100;
        float da = (float) (basicSalary * 8) / 100;
        float ta = (float) (basicSalary * 9) / 100;
        float pf = (float) (basicSalary * 20) / 100;
        float grossSalary = basicSalary + hra + ta + da - pf;
        System.out.println("|--------------------------------------------|");
        System.out.println("|                  Salary Slip               |");
        System.out.println("|--------------------------------------------|");
        System.out.println("|Employee ID                    : " + id + "         |");
        System.out.println("|Employee name                  : " + employeeName + "        |");
        System.out.println("|--------------------------------------------|");
        System.out.println("|Basic Salary                    : " + basicSalary + "    |");
        System.out.println("|HRA 10%                         : " + hra + "   |");
        System.out.println("|DA  8%                          : " + da + "    |");
        System.out.println("|TA 9%                           : " + ta + "   |");
        System.out.println("|PF 20%                          : " + pf + "   |");
        System.out.println("|--------------------------------------------|");
        System.out.println("|Gross Salary                    : " + grossSalary + " |");
        System.out.println("|--------------------------------------------|");

    }

}
