import java.util.Scanner;

/* Write a Java program to rearrange all the elements of a given array of integers so that all the odd numbers come before all the even numbers. 
The original order of odds and evens must be preserved. */

public class OddFirst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        try {
            // input n values from user
            int[] values = new int[n];
            for (int i = 0; i < n; i++) {
                values[i] = input.nextInt();
            }
            // printing result
            int[] returnArray = moveOdd(values);
            for (int k : returnArray) System.out.print(k + " ");

        } catch (NumberFormatException e) {
            System.out.println("Input Error");
        }
    }

    public static int[] moveOdd (int[] values) {
        int temp = 0;
        int tillIndex = 0;

        for(int i = 0; i < values.length; i++){
            if(values[i] % 2 != 0){

                for (int j = i; j > tillIndex; j--){
                    temp = values[j-1];
                    values[j-1] = values[j];
                    values[j] = temp;
                }
                tillIndex++;
            }
        }
        return values;
    }
}

