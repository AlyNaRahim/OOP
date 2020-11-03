import java.util.Scanner;

public class SumEvenFibonacciNumbers {
    public static void main(String[] args) {
        int n;
        Scanner console = new Scanner(System.in);
        n = console.nextInt();

        System.out.println(seq(n));
    }

    public static int seq (int n) {
        int nextNumber = 0;
        int num1 = 0;
        int num2 = 1;
        int sumEven = 0;
        int[] alpha = new int[15];

        for (int j = 1; j < 15; ++j) {
            nextNumber = num1 + num2;
            num1 = num2;
            num2 = nextNumber;
            alpha[j] += nextNumber;
        }

        if (n == 2){
            sumEven = 2;
        } else {
            for (int i = 0; i < 15; i++) {
                //System.out.print(alpha[i]+" ");
                if (alpha[i] < n && alpha[i] % 2 == 0) {
                    sumEven += alpha[i];
                }
            }
        }
        return sumEven;
    }
}
