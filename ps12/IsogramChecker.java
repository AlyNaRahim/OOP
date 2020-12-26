package ps12;

import java.util.HashSet;
import java.util.Set;

public class IsogramChecker {
    String input;

    public IsogramChecker() {
    }

    public boolean isIsogram (String input){
        input = input.replaceAll("[- ]", "").toLowerCase();

        if ("".equals(input)) {
            return true;
        } else {
            Set<Character> letterCount = new HashSet<>();

            char[] chars = input.toCharArray();

            for (int i = 0; i < chars.length; i++) {
                if (letterCount.contains(chars[i])) {
                    return false;
                } else {
                    letterCount.add(chars[i]);
                }
            }
        }
        return true;
    }
}
