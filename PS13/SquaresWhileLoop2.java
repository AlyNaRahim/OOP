package ps13;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SquaresWhileLoop2 {
    public static void main(String args[]) {
        System.out.println(IntStream.rangeClosed(1,10)
                                    .map(x -> x*x)
                                    .mapToObj(String :: valueOf)
                                    .collect(Collectors.joining(" ")));
    }
}
