import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        check();
    }

    public static void check() {
        Scanner input = new Scanner(System.in);
        System.out.print("");
        int number = input.nextInt();

        if (number == 0){
            System.out.println("0 is not odd nor even");
        }else if (number % 2 == 0){
            System.out.println("This number is even");
        }else {
            System.out.println("This number is odd");
        }

    }
}
