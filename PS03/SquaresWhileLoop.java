public class SquaresWhileLoop {
    public static void main(String[] args) {
        squares();
    }

    public static void squares() {
        int count = 0;
        int difference = 3;
        int sqr = 1;


        while (sqr <= 100){
            System.out.printf("%d ",sqr);
            sqr += difference;
            difference += 2;
        }

    }
}
