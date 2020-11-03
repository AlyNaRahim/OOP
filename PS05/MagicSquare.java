import java.util.InputMismatchException;
import java.util.Scanner;

/* Write a method called isMagicSquare that accepts a two-dimensional array of integers as a parameter and returns true if it is a magic square. 
A square matrix is a magic square if it is square in shape (same number of rows as columns, and every row the same length), 
and all of its row, column, and diagonal sums are equal.
Input is multidimensional Array */

public class MagicSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int rows = input.nextInt();
            int columns = input.nextInt();

            if (rows == columns && rows < 15) {
                int arrayValues[][] = new int[rows][columns];
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        arrayValues[i][j] = input.nextInt();
                    }
                }
                System.out.println(isMagicSquare(arrayValues));
            } else System.out.println("false");
        } catch (InputMismatchException e) {
            System.out.println("Enter a number");
        }
    }

    public static boolean isMagicSquare (int arrayValues[][]) {
        int diagonalSum = 0;
        int rightDiagonalSum = 0;
        int rowSum = 0;
        int colSum = 0;

        // Sum of left and right diagonal values
        for (int row = 0; row < arrayValues.length; row++) {
            diagonalSum += arrayValues[row][row];
            rightDiagonalSum += arrayValues[row][(arrayValues.length) - 1 - row];
        }
        if (diagonalSum != rightDiagonalSum){
            return false;
        }


        // row sum
        for (int row = 0; row < arrayValues.length; row++) {
            for (int column = 0; column < arrayValues.length; column++)
                rowSum += arrayValues[row][column];

            // checking each row sum (breaks if not true)
            if (rowSum != diagonalSum) {
                System.out.println("False");
                return false;
            }
            rowSum = 0; // resets the value for new row
        }

        // column sum
        for (int row = 0; row < arrayValues.length; row++) {
            for (int column = 0; column < arrayValues.length; column++)
                colSum += arrayValues[column][row];

            // checking each col sum (breaks if not true)
            if (colSum != diagonalSum) {
                System.out.println("False");
                return false;
            }
            colSum = 0; // resets the value for new row
        }

        return true;
    }

}
