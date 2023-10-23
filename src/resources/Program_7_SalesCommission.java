package resources;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then find this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2
 */
public class Program_7_SalesCommission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Instantiate Scanner object
        System.out.println("Please enter Id, name, salary amount, salary basic");
        int id = scanner.nextInt();
        scanner.nextLine();
        String name = scanner.nextLine();
        int salaryAmount = scanner.nextInt();
        int salaryBasic = scanner.nextInt();
        Program_7_SalesCommission obj = new Program_7_SalesCommission();//create object of the class
        obj.calculateCommission(salaryAmount);//call Instance method to calculate commission
        scanner.close();//close Scanner object
    }

    //Instance method to calculate commission
    public void calculateCommission(int salaryAmount) {
        int commission;
        if (salaryAmount >= 50000) {
            System.out.println("Commission is: " + (salaryAmount * 35) / 100);
        } else if (salaryAmount >= 30000 && salaryAmount < 50000) {
            System.out.println("Commission is: " + (salaryAmount * 20) / 100);
        } else if (salaryAmount >= 20000 && salaryAmount < 30000) {
            System.out.println("Commission is: " + (salaryAmount * 10) / 100);
        } else if (salaryAmount >= 10000 && salaryAmount < 20000) {
            System.out.println("Commission is: " + (salaryAmount * 5) / 100);
        } else {
            System.out.println("Commission is: " + (salaryAmount * 2) / 100);
        }
    }
}

