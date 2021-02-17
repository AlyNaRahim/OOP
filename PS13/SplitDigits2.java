package ps13;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SplitDigits2 {
    public static void main(String args[]) {
        splitDigits();
    }

    private static void splitDigits(){
        Scanner input = new Scanner(System.in);
        String number = input.next().trim();

        if (number.length() < 5){
            System.out.println("Number is too short!");
        } else if (number.length() > 5){
            System.out.println("Number is too long!");
        } else {
            IntStream chars = number.chars()
                    .map(Character::getNumericValue);

            System.out.println(chars.mapToObj(String :: valueOf)
                    .collect(Collectors.joining("\n")));
        }

    }
}

