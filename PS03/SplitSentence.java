import java.util.Scanner;

public class SplitSentence {
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
        // removing apostrophe - in order to keep the word merged not using split
        String newClause = clause.replaceAll("’","").replaceAll("'","");

        String [] splitWords = newClause.split("\"|,|\\s|\\.|/|-|\\(|\\)|—|‘");

        int count = 0;
        while (count <= splitWords.length - 1){
            if (!splitWords[count].isEmpty()) {
                System.out.println(splitWords[count]);
            }
            count += 1;
        }
    }

}
