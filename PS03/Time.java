import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        check();
    }

    public static void check() {
        Scanner input = new Scanner(System.in);
        System.out.print("");
        int time = input.nextInt();

        if (time < 0 | time > 24){
            System.out.println("Not acceptable time.");
        }else if (time <= 5){
            System.out.println("Good night!");
        }else if (time < 10){
            System.out.println("Good morning!");
        }else if (time < 20){
            System.out.println("Good day!");
        }else {
            System.out.println("Good evening!");
        }

    }
}
