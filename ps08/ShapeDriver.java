package ps08;

public class ShapeDriver {
    public static void main(String[] args) {
        Square s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getColor());
        s4.setSide(6.8);
        System.out.println(s4);
        System.out.println(s4.getSide());
    }
}
