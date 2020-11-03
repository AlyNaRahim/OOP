import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        check();
    }

    public static void check(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a dividend: ");
        int dividend = input.nextInt();

        System.out.printf("Enter a divisor: ");
        int divisor = input.nextInt();

        if (divisor == 0){
            System.out.println("Incorrect input!");
        }else{
            int quotient = dividend/divisor;
            System.out.printf("Quotient is : %d%n", quotient);
        }
    }
}
