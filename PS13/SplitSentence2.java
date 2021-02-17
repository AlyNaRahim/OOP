package ps13;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SplitSentence2 {
    public static void main(String args[]) {
        // declaration
        Scanner console = new Scanner(System.in);

        // input
        System.out.print("Enter the single line text please: ");
        String sentence = console.nextLine();

        // processing
        splitSentence2Words(sentence);
    }


    private static void splitSentence2Words(String clause) {
        clause = clause.trim();
        String newClause = clause.replaceAll("’","").replaceAll("'","");


        /* Write a program that reads one line of input text and breaks it up into words. The words should be output
         one per line. A word is defined to be a sequence of letters. Any characters in the input that are not letters
         should be discarded.
         */

        String [] splitWords = newClause.split("\"|,|\\s|\\.|/|-|\\(|\\)|—|‘");
        Arrays.stream(splitWords).forEach(System.out::println);

    }
}
