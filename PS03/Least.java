import java.util.Scanner;

public class Least {
    public static void main(String[] args) {
        check();
    }

    public static void check() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a <= b && a < c){
            System.out.printf("The least of these three numbers is %d%n",a);
        }else if (b <= c && b < a){
            System.out.printf("The least of these three numbers is %d%n",b);
        }else if (c <= a && c < b){
            System.out.printf("The least of these three numbers is %d%n",c);
        }else {
            System.out.printf("They are all equal");
        }

    }
}
