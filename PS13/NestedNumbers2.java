package ps13;

import java.util.stream.Stream;

public class NestedNumbers2 {
    public static void main(String[] args) {
        Stream.generate(() -> "000111222333444555666777888999").limit(4).forEach(System.out::println);
        //System.out.println(Stream.generate(() -> "000111222333444555666777888999").limit(4).collect(Collectors.joining("\n")));

    }
}
