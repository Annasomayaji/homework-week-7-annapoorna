package resources;

/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately
 */
public class Program_11_divisibleNumbers {
    public static void main(String[] args) {
        numberDivisibleByThree();

    }

    //static method to find numbers divisible by 3
    public static void numberDivisibleByThree() {
        System.out.println("");
        System.out.println("3's table");
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + ",");
        }
        System.out.println("\n-----------------------------------");
        System.out.println("5's table");
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0)
                System.out.print(i + ",");
        }
    }
}
