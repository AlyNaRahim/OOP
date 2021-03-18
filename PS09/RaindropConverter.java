package ps09;

import java.util.ArrayList;
import java.util.List;

public class RaindropConverter {
    public String convert(int number) {
        String rainDrops = "";

        if (number % 3 == 0) {
            rainDrops += "Pling";
        }

        if (number % 5 == 0) {
            rainDrops += "Plang";
        }

        if (number % 7 == 0) {
            rainDrops += "Plong";
        }

        if (rainDrops.length() == 0){
            rainDrops += Integer.toString(number);
        }
        return rainDrops;
    }
}
