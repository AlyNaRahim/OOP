package ps09;

import java.util.ArrayList;
import java.util.List;

public class PangramChecker {

    public boolean isPangram (String sentence){
        String[] alphabets = "a b c d e f g h i j k l m n o p q r s t u v w x y z".split(" ");
        String sentenceChanged = sentence.toLowerCase().replaceAll("\\s+","");

        for (String letter : alphabets) {
            if (!sentenceChanged.contains(letter)){
                return false;
            }
        }
        return true;
    }
}
