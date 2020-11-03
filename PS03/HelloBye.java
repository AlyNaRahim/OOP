import java.util.Scanner;

public class HelloBye {
    public static void main(String[] args) {
        check();
    }

    public static void check() {
        Scanner input = new Scanner(System.in);
        System.out.print("");
        String helloUpper = "HELLO WORLD!";
        String helloLower = "hello world!";
        String alphabet = input.nextLine();

        if (helloUpper.contains(alphabet) | helloLower.contains(alphabet)){
            System.out.println("Hello");
        } else {
            System.out.println("Bye");
        }

    }
}
