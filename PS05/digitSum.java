import java.util.InputMismatchException;
import java.util.Scanner;

public class digitSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            long number = input.nextLong();
            long absNumber = Math.abs(number);
            if (Long.toString(absNumber).length() > 10){
                System.out.println("error");
            } else {
                System.out.println(sum(absNumber));
            }

        } catch (InputMismatchException e){
            System.out.println("error");
        }
    }


    public static int sum (long number) {
        long remainder = number;
        int lastDigit = 0;
        int addition = 0;

        while (remainder > 0) {
            lastDigit = (int) (remainder % 10);
            remainder /= 10;
            addition += lastDigit;
        }
        return addition;
    }

}
