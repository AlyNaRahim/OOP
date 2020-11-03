public class NumbersOutput60 {
    public static void main(String[] args) {

        int numCount = 0;
        int frequency = 0;
        int lineCount = 0;
        int lineCount2 = 0;
        String spaceString = "";
        String numString = "";

        while (lineCount < 6){
            while (frequency < 10){
                if (frequency == 9){
                    spaceString += "|";
                } else {
                    spaceString += " ";
                }
                frequency += 1;
            }
            System.out.printf("%s",spaceString);
            lineCount += 1;
        }
        System.out.println();
        System.out.printf("123456789");


        while (lineCount2 < 4){
            while (numCount < 10){
                numString += numCount;
                numCount += 1;
            }
            System.out.printf("%s",numString);
            lineCount2 +=1;
        }
        System.out.printf("01234567890");

    }
}
