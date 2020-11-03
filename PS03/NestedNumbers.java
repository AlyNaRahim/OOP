public class NestedNumbers {
    public static void main(String[] args) {
        draw();
    }

    public static void draw() {
        int countRow = 0;
        int countNumber = 0;
        int numFrequency = 0;
        String digitString = "";

        while (countRow < 3) {
            while (countNumber < 10) {
                while (numFrequency < 3) {
                    digitString += countNumber;
                    numFrequency += 1;
                }
                numFrequency = 0;
                countNumber += 1;
            }
            System.out.printf("%s%n", digitString);
            countRow += 1;
        }
    }
}
