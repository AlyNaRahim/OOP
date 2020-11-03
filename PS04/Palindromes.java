import java.util.Scanner;

public class Palindromes {
    public static void main(String args[]) {

        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int digit = console.nextInt();

        if (isPalindrome2(digit)){
            System.out.println("This number is a palindrome");
        } else {
            System.out.println("This number is not a palindrome");
        }

    }

    private static boolean isPalindrome2 (int digit){
        int reverseDigit = 0;
        int remainder = digit;
        int lastDigit = 0;

        while (remainder != 0) {
            lastDigit = remainder % 10;
            reverseDigit = (reverseDigit * 10) + lastDigit;
            remainder /= 10;
        }

        if (digit == reverseDigit){
            return true;
        } else {
            return false;
        }
    }

}
