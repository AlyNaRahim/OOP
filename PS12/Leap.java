package ps12;

public class Leap {
    int year;

    public Leap() {
    }

    public boolean isLeapYear (int year){
        boolean isLeap;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            } else
                isLeap = true;
        } else {
            isLeap = false;
        }
        return isLeap;
    }
}
