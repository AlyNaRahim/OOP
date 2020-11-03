public class StarSquare {
    public static void main(String[] args) {

        int countRow = 0;
        int countStar = 0;
        String star = "*";

        while (countRow < 4) {
            while (countStar < 4) {
                star += '*';
                countStar += 1;
            }
            System.out.printf("%s%n",star);
            countRow += 1;
        }
    }
}
