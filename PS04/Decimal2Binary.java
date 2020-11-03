import java.util.Scanner;

public class Decimal2Binary {
    public static void main(String[] args) {
        // you may modify the code below, but try to preserve the program structure
        int decimalNumber;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        decimalNumber = console.nextInt();

        System.out.printf("Binary of %d is %s", decimalNumber, decimalToBinary(decimalNumber));
    }

    private static String decimalToBinary(int decimalNumber) {
        int decimalNumberTemp = decimalNumber;
        int mod;
        int [] binary = new int[8];
        StringBuilder binaryNumber = new StringBuilder();
        int index = 0;
        //String reverseBinary = ""; for loop method

        while (decimalNumberTemp > 0){
            mod = decimalNumberTemp % 2;
            decimalNumberTemp = decimalNumberTemp / 2;
            binary[index] = mod;
            index += 1;
        }

        // for loop method for reversing the array
        for (int i = (binary.length)-1; i >= 0; i--){
            binaryNumber.append(binary[i]);
        }

        return binaryNumber.toString();


    }
}
