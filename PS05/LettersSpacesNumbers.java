import java.util.Scanner;

/* Write a Java program to count the letters, spaces, numbers and other characters of an input string.
    
    Input:
    The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
    
    Output:
    letter: 34
    space: 14
    number: 10
    other: 7 */

public class LettersSpacesNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        int [] returnedValues = count(sentence);
        System.out.println("letter: " + returnedValues[0]);
        System.out.println("space: " + returnedValues[1]);
        System.out.println("number: " + returnedValues[2]);
        System.out.println("other: " + returnedValues[3]);

    }

    public static int[] count(String sentence) {
        int [] countValues = new int[4];
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLetter(sentence.charAt(i))){
                countValues[0] += 1;
            } else if (Character.isWhitespace(sentence.charAt(i))){
                countValues[1] += 1;
            } else if (Character.isDigit(sentence.charAt(i))){
                countValues[2] += 1;
            } else {
                countValues[3] += 1;
            }
        }
        return countValues;
    }
}
