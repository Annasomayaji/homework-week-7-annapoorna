package resources;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class Program_19_AverageOfArray {
    public static void main(String[] args) {
        int myArray[] = {5, 4, 6, 10};
        Program_19_AverageOfArray obj = new Program_19_AverageOfArray();
        obj.findAverage(myArray);//calling instance method
    }
//Instance method to calculate Average
    public void findAverage(int[] myArray) {
        int total = 0, noOfElement = 0;
        float avg = 0;
        for (int i : myArray) {
            total = total + i;
            noOfElement = noOfElement + 1;
        }
        avg = (float) total / noOfElement; //divide the sum by number of elements
        System.out.println("Average:" + avg);
    }
}
