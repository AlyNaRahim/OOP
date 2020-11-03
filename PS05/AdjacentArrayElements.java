import java.util.Scanner;
/* Write a program that takes input 10 integer numbers and stores in an array. 
Count the series of 2 or more adjacent elements in an array and output the number of adjacent elements in the Array. */

public class AdjacentArrayElements {
    public static void main(String[] args) {

        // input from user and splitting based on space
        Scanner console = new Scanner(System.in);
        String[] stringNumbers = console.nextLine().trim().split(" ");


        // converting String to int array
        try {
            int[] numbers = new int[10];
            for (int k = 0; k < numbers.length; k++) {
                numbers[k] = Integer.parseInt(stringNumbers[k]);
            }
            System.out.println(adjacent(numbers));

        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Error");
        }
    }

    public static int adjacent (int [] numbers){
        int temp = numbers[0];
        int count = 0; // times a similar digit is repeated
        int count2 = 0; // number of pairs


        for (int i = 1; i < numbers.length; i++){
            if (!(i == 9)) { // if there is no adjacent at the end of the array
                if (numbers[i] == temp) {
                    count++;
                } else if (count > 0) {
                    count2++;
                    count = 0;
                }
            } else if (count > 0){
                count2 ++;
            }
            temp = numbers[i];
        }

        if (count == 9){ 
            return 1; // if all 10 elements are similar 
        } else {
            return count2;
        }
    }
}
