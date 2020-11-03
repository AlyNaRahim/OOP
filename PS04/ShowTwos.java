import java.util.Scanner;

public class ShowTwos {
    public static void main(String[] args) {
        int number;

        Scanner console = new Scanner(System.in);
        number = console.nextInt();
        System.out.printf("%d = %s",number, showTwos(number));

    }

    public static String showTwos(int number) {
        String answer = "";
        int quotient = number;

        while (true) {
            if (quotient % 2 == 0) {
                answer += "2 * ";
                quotient /= 2;
            } else {
                answer += quotient;
                break;
            }
        }
        return answer;
    }


}
