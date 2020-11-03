import java.util.Scanner;

public class MaxMirror {
    public static void main(String[] args) {
        // input from user and splitting based on space
        Scanner console = new Scanner(System.in);
        String[] stringNumbers = console.nextLine().trim().split(" ");


        // converting String to int array
        try {
            int[] numbers = new int[stringNumbers.length];
            for (int k = 0; k < numbers.length; k++) {
                numbers[k] = Integer.parseInt(stringNumbers[k]);
            }
            System.out.println(mirror(numbers));

        } catch (NumberFormatException e) {
            System.out.println("Error");
        }
    }

    public static int mirror (int[] numbers) {
        int max = 0;

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = numbers.length - 1; j >= 0 && i + count < numbers.length; j--) {
                if (numbers[i + count] == numbers[j]) {
                    count++;
                } else {
                    max = Math.max(max, count);
                    count = 0;
                }
            }

            max = Math.max(max, count);
        }

        if (max > 7) max = max / 2;
        return max;
    }
}
