import java.util.Scanner;

public class LongWords {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int numberOfWords = Integer.parseInt(console.nextLine());

        // reading n words, converting to abbreviation and appending in wordList
        int j = 0;
        String [] wordList = new String[numberOfWords];
        while (j < numberOfWords) {
            String word = console.nextLine();
            wordList[j] = abbreviate(word);
            j++;
        }

        // printing words
        for (String s : wordList) {
            System.out.println(s);
        }
    }


    private static String abbreviate(String word) {
        int count = word.length() - 2;
        char first = word.charAt(0);
        char last = word.charAt(word.length()-1);
        String result = "";

        if (word.length() > 10){
            result = first + String.valueOf(count) + last;
        }else {
            result = word;
        }
        return result;
    }

}
