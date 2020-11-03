import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        int n;
        Scanner console = new Scanner(System.in);
        n = console.nextInt();

        for (int j = 2; j <= n; j++){
            if (isPrime(j)){
                System.out.printf("%d ",j);
            }
        }

    }

    // The method that determines whether a number is a prime or not a prime.
    public static boolean isPrime(int num) {
        boolean prime = false;


        // is Prime
        if (num == 2){
            prime = true;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
                prime = true;
            }
        }
        return prime;
    }
}

