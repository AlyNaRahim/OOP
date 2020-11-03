import java.util.Scanner;

public class Scrabble {
    private String word;

    public Scrabble(String word) {
        word = word.replaceAll("[^a-zA-Z\\s+]", "");
        this.word = word;
    }


    public int getScore(){
        word = word.toUpperCase();

        char[] charList1 = {'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T'};
        int count1 = 0;
        char[] charList2 = {'D', 'G'};
        int count2 = 0;
        char[] charList3 = {'B', 'C', 'M', 'P'};
        int count3 = 0;
        char[] charList4 = {'F', 'H', 'V', 'W', 'Y'};
        int count4 = 0;
        char[] charList5 = {'J', 'X'};
        int count5 = 0;
        char[] charList6 = {'Q', 'Z'};
        int count6 = 0;
        int count7 = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)== 'K'){
                count7 += 1;
            } else {
                for (int element : charList1) {
                    if (element == word.charAt(i)) {
                        count1 += 1;
                    }
                }
                for (int element : charList2) {
                    if (element == word.charAt(i)) {
                        count2 += 1;
                    }
                }
                for (int element : charList3) {
                    if (element == word.charAt(i)) {
                        count3 += 1;
                    }
                }
                for (int element : charList4) {
                    if (element == word.charAt(i)) {
                        count4 += 1;
                    }
                }
                for (int element : charList5) {
                    if (element == word.charAt(i)) {
                        count5 += 1;
                    }
                }
                for (int element : charList6) {
                    if (element == word.charAt(i)) {
                        count6 += 1;
                    }
                }
            }
        }

        int sum = (count1 * 1) + (count2 * 2) +(count3 * 3)+(count4 * 4)+ (count7 *5)+(count5 *8)+(count6 * 10);
        return sum;
    }

    @Override
    public String toString() {
        String s = Integer.toString(getScore());
        return s;
    }
}
