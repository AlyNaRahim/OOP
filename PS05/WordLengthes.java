import java.util.Scanner;

/* Write a Java static method called wordLengths() that accepts a string. 
Your method should count the number of letters in each word in the string, and output a bar chart of how many letters contain each word. */

public class WordLengthes {
    public static void main(String[] args) {
        // input from user and splitting based on space
        Scanner console = new Scanner(System.in);
        String [] wordArray = console.nextLine().split(" ");

        // reading the returned values from the method
        int [] returnedValue = letterCount(wordArray);
        String stars = " ";

        // printing bar chart
        for (int k = 0; k < returnedValue.length; k++){
            System.out.print((k+1) + ": " + returnedValue[k] + "\t");
            for (int m = 0; m < returnedValue[k]; m++){
                stars += "*";
            }
            System.out.println(stars);
            stars = " ";
        }
    }

    public static int []letterCount (String []wordArray){
        int []count = new int[wordArray.length];

        for (int i = 0; i < wordArray.length; i++){
            for (int j = 0; j < wordArray[i].length(); j++){
                if (Character.isLetter(wordArray[i].charAt(j))){
                    count[i] += 1;
                }
            }
        }
        return count;
    }
}
