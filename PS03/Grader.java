import java.util.Scanner;

public class Grader {
    public static void main(String[] args) {
        check();
    }

    public static void check(){
        Scanner input = new Scanner(System.in);
        System.out.printf("");
        int grade = input.nextInt();

        /* condition statement*/
        if (grade >= 50 & grade <= 100){
            System.out.println("Passed");
        } else if (grade >= 0 & grade < 50){
            System.out.println("Failed");
        }else{
            System.out.println("Incorrect grade!");
        }


    }
}
