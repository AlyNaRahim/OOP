import java.util.Scanner;

/* Write a program that takes a sequence of integer numbers and N as an input from the user and prints out a modified version of the sequence as left-shifted by N. 
You must stop getting input from the user when he/she enters an empty string (Return). */

public class ShiftLeft {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // reading method values in array returnedValue
        String [] returnedValue = numberList(userInput(console),console);

        for(int k = 0; k< returnedValue.length; k++){
            if (k == returnedValue.length-1){
                System.out.print(returnedValue[k]);
            } else {
                System.out.print(returnedValue[k] + ", ");
            }
        }
    }

    // Method for taking int input from user and storing it in String format separated by space
    public static String userInput(Scanner console) {

        System.out.println("Enter your numbers, press return to end.");

        String strInputNumbers = "";

        while (console.hasNextLine()) {
            String value = console.nextLine();
            if (!value.isEmpty()) {
                try {
                    int valueInt = Integer.parseInt(value);
                    strInputNumbers += (value + " ");

                } catch (NumberFormatException e) {
                    System.out.println("Not a legal number. Try again!");
                }
            } else {
                break;
            }
        }
        return strInputNumbers;
    }

    public static String[] numberList(String strInputNumber, Scanner console) {
        System.out.print("Enter N: ");
        int shiftBy = console.nextInt();
        String[] intInputNumbers = strInputNumber.split(" ");

        // runs the loop shiftBy times
        for(int i = 0; i < shiftBy; i++){
            int j;
            String firstValue;
            //Storing last element of array
            firstValue = intInputNumbers[0];

            // iterates over all values
            for(j = 0; j < intInputNumbers.length-1 ; j++){
                //Shift element of array by one
                intInputNumbers[j] = intInputNumbers[j+1];
            }
            //Last element of array is added to the start of array.
            intInputNumbers[j] = firstValue;
        }

        return intInputNumbers;
    }
}
