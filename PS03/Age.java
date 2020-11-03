import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        check();
    }

    public static void check() {
        Scanner input = new Scanner(System.in);
        System.out.print("");
        int age = input.nextInt();

        if (age < 0 | age > 150){
            System.out.println("Incorrect age.");
        }else if (age >=18 & age <= 150){
            System.out.println("Old enough!");
        }else {
            System.out.println("Too young.");
        }

    }
}
