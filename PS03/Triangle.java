import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        isValid();
    }

    public static void isValid() {
        Scanner input = new Scanner(System.in);
        int angle1 = input.nextInt();
        int angle2 = input.nextInt();
        int angle3 = input.nextInt();

        int sum = angle1 + angle2 + angle3;

        System.out.println((angle1 == 0 || angle2 == 0 || angle3 ==0 || sum != 180) ? "It is not a valid triangle."
                :"It is a valid triangle.");

    }
}
