import java.util.Scanner;

public class SplitDigits {
    public static void main(String args[]) {
        splitDigits();
    }

    private static void splitDigits() {
        Scanner input = new Scanner(System.in);
        String digit = input.nextLine();
        String digitEdit = digit.trim();
        int count = 0;


        if (digitEdit.length() == 5) {
            while (count < 5) {
                System.out.println(digitEdit.charAt(count));
                count += 1;
            }
        } else if (digitEdit.length() < 5) {
            System.out.println("Number is too short!");
        } else {
            System.out.println("Number is too long!");
        }
    }
}