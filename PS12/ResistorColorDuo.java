package ps12;

import java.util.Arrays;

public class ResistorColorDuo {
    String [] inputColors;

    public ResistorColorDuo() {
    }


    public int value (String [] inputColors) {
        String[] colorsEncoding = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int colorOne = 0;
        int colorTwo = 0;

        for (int i = 0; i < colorsEncoding.length; i++) {
            if (colorsEncoding[i].equals(inputColors[0])) {
                colorOne = i;
            }
            if (colorsEncoding[i].equals(inputColors[1])) {
                colorTwo = i;
            }
        }
        return colorOne * 10 + colorTwo;
    }
}
