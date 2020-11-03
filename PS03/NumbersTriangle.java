public class NumbersTriangle {
    public static void main(String[] args) {
        
        int countRow = 1;
        int digitFrequency = 0;
        String digitString = "";
        
        while (countRow < 8) { 
            while (digitFrequency < countRow) { 
                digitString += countRow;
                digitFrequency += 1;
            }
            digitFrequency = 0; // reset frequency for new digit
            countRow += 1;
            System.out.printf("%s%n", digitString);
            digitString = ""; // reset the string to blank
            }
    }
}

