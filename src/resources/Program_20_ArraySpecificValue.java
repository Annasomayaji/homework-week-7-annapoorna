package resources;
/**
 * Write a Java program to test if an array contains a specific value
 */
public class Program_20_ArraySpecificValue {
    public static void main(String[] args) {
        int myArray[] = {2, 5, 3, 7, 8};
        int findValue = 3;// assign a value to find to a variable
        findValueInArray(myArray, findValue);//call method to find the existence of the value in the array
    }

    public static void findValueInArray(int[] myArray, int findValue) {
        boolean found = false;//a boolean variable to store result status
        for (int i : myArray) {
            if (findValue == i) { //verify if the array index value is equal to the value
                found = true; //assign true if equal
                break;
            } else {
                found = false;//assign false if not equal
            }
        }
        if (found) { //print result based on the boolean value
            System.out.println("The value " + findValue + " is found in the array");
        } else {
            System.out.println("The value " + findValue + " is not found in the array");
        }

    }
}
