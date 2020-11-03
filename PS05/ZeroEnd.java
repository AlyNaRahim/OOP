import java.util.Scanner;

/* Write a Java program that implements the function named zeroEnd so that it returns an array that contains the exact same numbers as the given array, 
but rearranged so that all the zeros are grouped at the end of the array. The order of the non-zero numbers does not matter */

public class ZeroEnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] numArray = input.nextLine().trim().split(" ");

        // converting String to int array
        try {
            int[] numArrayInt = new int[numArray.length];
            for (int k = 0; k < numArray.length; k++) {
                numArrayInt[k] = Integer.parseInt(numArray[k]);
            }
            // printing result
            int[] returnArray = swapReverse (numArrayInt);
            for (int k : returnArray) System.out.print(k + " ");

        } catch (NumberFormatException e) {
            System.out.println("Input Error");
        }
    }

    public static int[] swapReverse (int[] numArrayInt) {
        int temp = 0;

        for (int i = 0; i < numArrayInt.length; i++) {
            for (int j = 1; j < (numArrayInt.length - i); j++) {
                if (numArrayInt[j - 1] == 0) {

                    //swap elements
                    temp = numArrayInt[j - 1];
                    numArrayInt[j - 1] = numArrayInt[j];
                    numArrayInt[j] = temp;
                }
            }
        }
        return numArrayInt;
    }
}
