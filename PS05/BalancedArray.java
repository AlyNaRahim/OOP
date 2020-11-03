import java.util.Scanner;

/* Write a program that takes input 10 integer numbers and stores it in an array. 
Afterward, decide whether this array can be balanced or not. 
An array is balanced if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side. */


public class BalancedArray {
    public static void main(String[] args) {
        // input from user and splitting based on space
        Scanner console = new Scanner(System.in);
        String[] stringNumbers = console.nextLine().trim().split(" ");

        // converting String to int array
        try {
            int[] numbers = new int[10];
            for (int k = 0; k < numbers.length; k++) {
                numbers[k] = Integer.parseInt(stringNumbers[k]);

            } if (isBalanced(numbers)){
                System.out.println("Can be balanced");
            } else {
                System.out.println("Can not be balanced");
            }

        } catch (NumberFormatException e) {
            System.out.println("Error");
        }
    }

    public static boolean isBalanced (int [] numbers){
        int sumLeft = numbers[0];
        int sumRight = 0;
        int countL = 0; // number of values from left
        int countR = 0; // number of values from right


        for (int i = 1; i < numbers.length; i++){
            sumLeft += numbers[i];
            countL ++;
            for (int j = numbers.length - 1; j > 0; j--) {
                System.out.println("L "+ sumLeft + " R "+ sumRight);
                countR ++;
                if (sumLeft == sumRight && (countR + countL) == 10){
                    return true;
                } else {
                    sumRight += numbers[j];
                }
            }
            sumRight = 0;
            countR = 0;
        }

        return false;
    }
}
