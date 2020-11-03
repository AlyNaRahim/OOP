import java.util.Scanner;

public class Binary2Decimal {
    public static void main(String[] args) {
        // you may modify the code below, but try to preserve the program structure
        int binaryNumber;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        binaryNumber = console.nextInt();

        System.out.printf("Decimal of %d is %d", binaryNumber, binaryToDecimal(binaryNumber));
    }

    private static int binaryToDecimal(int binaryNumber) {
        int binaryNumberTemp = binaryNumber;
        int decimalNumber = 0;
        int lastDigit;
        int index = 0;
        

        while (true){
            if (binaryNumberTemp == 0){
                break;
            } else {
                lastDigit = binaryNumberTemp % 10;
                decimalNumber += lastDigit * Math.pow(2,index);
                binaryNumberTemp = binaryNumberTemp / 10;
                index += 1;
            }
        }

        return decimalNumber;
    }
}
