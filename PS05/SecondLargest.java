import java.util.Arrays;
import java.util.Scanner;

/* Given the size of an array of doubles as N, get all numbers from the user. Afterward, find and output the second largest element from the array */

public class SecondLargest {
    public static void main(String[] args) {
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = input2.nextInt();

        // input n values from user
        double[] values = new double[n];
        for (int i = 0; i < n; i++){
            values[i] = input2.nextDouble();
        }
        System.out.println(result(values));
    }

    public static double result (double []values) {
        Arrays.sort(values);
        return values[values.length - 2];
    }
}
