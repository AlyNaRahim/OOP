import java.util.Scanner;

/* Consider the leftmost and rightmost appearances of some value in an array. 
Span is the count of all the elements between two repeating elements including the repeated elements. 
Implement the Java static method maxSpan() that returns the maximum span from the received array of integers. */

public class MaximumSpan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] numArray = input.nextLine().trim().split(" ");

        // converting String to int array
        try {
            int[] numArrayInt = new int[numArray.length];
            for (int k = 0; k < numArray.length; k++) {
                numArrayInt[k] = Integer.parseInt(numArray[k]);
            }
            System.out.println(maximum(numArrayInt));

        } catch (NumberFormatException e) {
            System.out.println("Input Error");
        }
    }

    public static int maximum (int [] numberArray){
        if (numberArray.length > 0)
        {
            int maxSpanFinal = 1;
            for (int i = 0; i < numberArray.length; i++)
                for (int j = numberArray.length - 1; j > i; j--)
                    if (numberArray[j] == numberArray[i])
                    {
                        int count = (j - i) + 1;
                        if (count > maxSpanFinal) maxSpanFinal = count;
                        break;
                    }
            return maxSpanFinal;
        }
        else return 0;
    }
}
