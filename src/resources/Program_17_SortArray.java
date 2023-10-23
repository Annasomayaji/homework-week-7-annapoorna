package resources;
/**
 * Write a Java program to sort a numeric array and a string array.
 */

import java.util.Arrays;

public class Program_17_SortArray {
    public static void main(String[] args) {
        //declare an integer array and assign values
        int arrayA[] = new int[5];
        arrayA[0] = 3;
        arrayA[1] = 5;
        arrayA[2] = 6;
        arrayA[3] = 3;
        arrayA[4] = 7;
        //declare a string array and assign values
        String arrayB[] = {"Banana", "Orange", "Apple", "Pear"};
        Program_17_SortArray obj = new Program_17_SortArray();//object instantiate of class
        obj.sortIntArray(arrayA);//call integer array sorting method
        obj.sortStringArray(arrayB);//call string array calling method
    }

    public void sortIntArray(int[] myArrayA) {
        Arrays.sort(myArrayA);//sort() method of Arrays class
        for (int i : myArrayA) {//for each loop
            System.out.println(i + " ");
        }
    }

    public void sortStringArray(String[] myArrayB) {
        Arrays.sort(myArrayB);//sort method of Arrays class
        for(String i:myArrayB){//for each loop

            System.out.print(i+ ",");
        }
    }
}
