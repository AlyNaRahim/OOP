import java.util.Scanner;

public class ShiftRight {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

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
            String lastValue;
            //Storing last element of array
            lastValue = intInputNumbers[intInputNumbers.length-1];

            // iterates over all values
            for(int j = intInputNumbers.length-1; j > 0; j--){
                //Shift element of array by one
                intInputNumbers[j] = intInputNumbers[j-1];
            }
            //Last element of array is added to the start of array.
            intInputNumbers[0] = lastValue;
        }

        return intInputNumbers;
    }
}

