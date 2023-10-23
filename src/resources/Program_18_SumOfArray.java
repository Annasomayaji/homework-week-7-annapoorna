package resources;

/**
 * Write a Java program to sum values of an array
 */
public class Program_18_SumOfArray {

    public static void main(String[] args) {
        int myArray[] = new int[5]; //array declaration
        myArray[0] = 5;
        myArray[1] = 2;
        myArray[2] = 1;
        myArray[3] = 4;
        myArray[4] = 3;
        findSumOfArray(myArray);//method call to find the sum
    }

    //static method to calculate the sum
    public static void findSumOfArray(int[] myArray) {
        int sum = 0;
        for (int i : myArray) {
            sum = sum + i;
        }
        System.out.println("Sum:" + sum);
    }

}
