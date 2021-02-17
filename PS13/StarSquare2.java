package ps13;

import java.util.stream.Stream;

public class StarSquare2 {
    public static void main(String[] args) {
        Stream.generate(() -> "*****").limit(4).forEach(System.out::println);
        //System.out.println(Stream.generate(() -> "*****").limit(5).collect(Collectors.joining("\n")));
    }
}
