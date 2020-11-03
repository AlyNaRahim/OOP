import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        String n;
        Scanner console = new Scanner(System.in);
        n = console.nextLine();

        // checks if string is a valid digit, converts negative int to it's abs value
            try {
                int num1 = Math.abs(Integer.parseInt(String.valueOf(n)));

                String sNum1 = Integer.toString(num1);

                // concatenation nn
                String n2 = sNum1 + sNum1;
                int num2 = Integer.parseInt(n2);

                // concatenation nnn
                String n3 = sNum1 + sNum1 + sNum1;
                int num3 = Integer.parseInt(n3);

                // sum value
                int sum = num1 + num2 + num3;
                System.out.printf("%s + %s + %s = %s", sNum1, n2, n3, sum);

            } catch (NumberFormatException e) {
                System.out.println("error");
            }
        }
}
