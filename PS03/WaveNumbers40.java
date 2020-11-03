public class WaveNumbers40 {
    public static void main(String[] args) {
        line();
        pattern();
        numbers();
        line();

    }
    public static void line() {
        int lineCount = 0;
        while (lineCount < 40){
            System.out.printf("-");
            lineCount += 1;
        }
        System.out.println();
    }

    public static void pattern() {
        int patternCount = 0;
        while (patternCount < 10){
            System.out.printf("_-^-");
            patternCount += 1;
        }
        System.out.println();
    }

    public static void numbers() {
        int numCount = 1;
        int colCount = 0;
        int numFre = 0;
        String s = "";

        while (numCount < 10) {
            while (numFre < 2) {
                s += numCount;
                numFre += 1;
            }
            numFre = 0;
            numCount += 1;
        }
        System.out.printf("%s",s);
        System.out.printf("00%s00%n",s);

    }

}
