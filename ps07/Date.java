package ps07;

public class Date {
    private int day;
    private int month;
    private  int year;

    public Date(int day, int month, int year) {
        if (!isValidDate(day,month,year)){
            throw new IllegalArgumentException();
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate (int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        StringBuilder dateString = new StringBuilder();
        String d = String.format("%02d", day);
        String m = String.format("%02d", month);

        if (!isValidDate(day,month,year)){
            throw new IllegalArgumentException();
        }
        dateString.append(d).append("/").append(m).append("/").append(year);
        return dateString.toString();
    }

    public boolean isValidDate (int day, int month, int year){
        boolean isValid;
        if (year < 1900 || year > 9999) return false;
        if (month < 1 || month > 12) return false;
        if (day < 1 || day > 31) return false;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case10:
                return true;
            case 2: return (isLeapYear(year) ? day <= 29 : day <= 28);
            case 4:
            case 6:
            case 9:
            case 11:
                return day < 30;
            default: return true;
        }
    }

    public boolean isLeapYear (int year) {
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
