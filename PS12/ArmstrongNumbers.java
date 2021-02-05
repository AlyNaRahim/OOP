package ps12;

public class ArmstrongNumbers {
    int number;

    public ArmstrongNumbers() {
    }

    public boolean isArmstrongNumber (int number){
        int remainder = number;
        int inputLength = String.valueOf(number).length();
        int resultNumber = 0;
        int lastDigit;

        while (remainder > 0) {
            lastDigit = remainder % 10;
            remainder /= 10;
            resultNumber += Math.pow(lastDigit, inputLength);
        }
        return number == resultNumber;
    }
}
