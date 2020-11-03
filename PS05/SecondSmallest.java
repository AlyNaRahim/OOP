import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = input.nextInt();

        // input n values from user
        double[] values = new double[n];
        for (int i = 0; i < n; i++){
            values[i] = input.nextDouble();
        }
        System.out.println(result(values));
    }

    public static double result (double []values){
        Arrays.sort(values);
        double secondSmallest = values [1];
        return secondSmallest;
    }

}
