public class SpacedNumbers {
    public static void main(String[] args) {
        int countRow = 1;
        int countCol = 1;
        int dif = 5;

        while (countRow < 6) {
            while (countCol < 6) {
                if (countCol == dif){
                    System.out.printf("%d",countRow);
                } else{
                    System.out.printf(" ");
                }
                countCol += 1;
            }
            dif -= 1;
            System.out.println();
            countRow += 1;
            countCol = 1;
        }
    }
}
