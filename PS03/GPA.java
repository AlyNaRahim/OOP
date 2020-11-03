import java.util.Scanner;

public class GPA {

    public static void main(String[] args) {
        gradeToLetter();
    }

    public static void gradeToLetter() {
        Scanner input = new Scanner(System.in);
        double percentage = input.nextDouble();


        if (percentage < 0 || percentage > 100){System.out.println("Incorrect grade!");}
        else if (percentage >= 93) {System.out.println("A 4.0");}
        else if (percentage >= 90) {System.out.println("A- 3.67");}
        else if (percentage >= 87) {System.out.println("B+ 3.33");}
        else if (percentage >= 83) {System.out.println("B 3.0");}
        else if (percentage >= 80) {System.out.println("B- 2.67");}
        else if (percentage >= 77) {System.out.println("C+ 2.33");}
        else if (percentage >= 70) {System.out.println("C 2.0");}
        else if (percentage >= 60) {System.out.println("D 1.0");}
        else {System.out.println("F 0.0");}
        }
    }


