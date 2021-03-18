package ps09;

public class DifferenceOfSquaresCalculator {

        public int computeSquareOfSumTo (int number){

            int sumOfN = (number * (number + 1)) / 2;
            int squareSumOfN = sumOfN * sumOfN;

            return squareSumOfN;
        }

        public int computeSumOfSquaresTo (int number){
            int sumSquareOfN = number * (number + 1) * (2 * number+1) / 6;
            return sumSquareOfN;
        }

        public int computeDifferenceOfSquares (int number){
            return computeSquareOfSumTo(number) - computeSumOfSquaresTo(number);
        }
}
