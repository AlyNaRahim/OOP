import java.util.Scanner;

public class Capitalize {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println(capitalize(sentence));
    }

    public static String capitalize(String sentence) {
        sentence = sentence.trim();
        String[] words = sentence.split(" ");
        String capital = "";

        int count = 0;
        while (count <= words.length - 1) {
            capital += Character.toUpperCase(words[count].charAt(0)) + words[count].substring(1) + " ";
            count += 1;
        }
        return capital;
    }
}
