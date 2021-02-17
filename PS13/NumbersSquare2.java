package ps13;


import java.util.stream.Stream;

public class NumbersSquare2 {
    public static void main(String[] args) {
        Stream.generate(() -> "12345").limit(5).forEach(System.out::println);
        //System.out.println(Stream.generate(() -> "12345").limit(5).collect(Collectors.joining("\n")));

    }
}
