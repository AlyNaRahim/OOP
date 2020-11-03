import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        // add your code here
        int n;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        n = console.nextInt();

        factorialOfN(n);

    }

    private static long factorialOfN(int n) {
        long factorial = 1;
        if (n < 0){
            System.out.println("Incorrect input!");
        } else {
            System.out.println("X \t X!");
            for (int i = 0; i <= n; i++){
                System.out.printf("%d \t %d%n", i,factorial);
                factorial *= i+1;
            }
        }

        return factorial;
    }
}
