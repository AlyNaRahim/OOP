/* Sum of three integers
round down if less than 5, round up if greater than 5
 */

import java.util.Scanner;

public class RoundSumOfInteger {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.print("Enter three integers: ");
        String number = console.nextLine();
        String [] numberArray = number.trim().split(" ");

        int number1 = Integer.parseInt(numberArray[0]);
        int number2 = Integer.parseInt(numberArray[1]);
        int number3 = Integer.parseInt(numberArray[2]);

        System.out.println("Rounded sum is " + roundSum(number1,number2,number3));
    }

    private static int roundSum(int number1, int number2, int number3) {
        int addition = number1 + number2 + number3;
        int mod = addition % 10;

        if(mod < 5) {
            addition = addition - mod;
        }else {
            addition = addition + (10 - mod);
        }

        return addition;

    }
}
