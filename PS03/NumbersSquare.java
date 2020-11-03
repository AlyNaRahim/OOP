public class NumbersSquare {
    public static void main(String[] args) {

        int countRow = 0;
        int countDigit = 1;
        String digit = "";

        while (countRow < 4) {
            while (countDigit < 6) {
                digit += countDigit;
                countDigit += 1;
            }
            System.out.printf("%s%n",digit);
            countRow += 1;
        }
    }
}
