package ps09;

public class NaturalNumber {
    private int number;

    public NaturalNumber(int number) {
        if(number < 1)
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        this.number=number;
    }


    public Classification getClassification() {
        int aliquotSum = 0;
        if (number > 0) {
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    aliquotSum += i;
                }
            }
        }

        if (aliquotSum == number){
            return Classification.PERFECT;
        } else if (aliquotSum > number){
            return Classification.ABUNDANT;
        } else {
            return Classification.DEFICIENT;
        }
    }

}
