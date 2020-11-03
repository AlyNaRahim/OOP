import java.util.InputMismatchException;
import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args) {
        // user input
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Input first binary number: ");
            int num1 = input.nextInt();
            System.out.print("Input second binary number: ");
            int num2 = input.nextInt();
            System.out.println("Sum of two binary numbers: " + addition(num1,num2));

        } catch (InputMismatchException e){
            System.out.println("Not a valid binary number ");
        }
    }

    public static String addition(int num1, int num2) {
        int remainderNum1 = num1;
        int remainderNum2 = num2;
        int modNum1, modNum2;
        int sum = 0;
        int carry = 0;
        String reverseResult = "";
        String result = "";

        while (remainderNum1 != 0 || remainderNum2 != 0) {
            modNum1 = remainderNum1 % 10;
            modNum2 = remainderNum2 % 10;
            remainderNum1 /= 10;
            remainderNum2 /= 10;
            sum = modNum1 + modNum2 + carry;

            if (sum > 1) {
                carry = sum / 2;
                sum = sum % 2;
            } else {
                carry = 0;
            }
            reverseResult += sum;
        }
        if (carry == 1){
            reverseResult += carry;
        }


        // reversing the string
        for (int i = reverseResult.length()-1; i >= 0; i--){
            result += reverseResult.charAt(i);
        }
        return result;
    }
}
