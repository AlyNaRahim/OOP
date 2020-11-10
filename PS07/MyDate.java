package ps07;

import java.lang.reflect.Array;

public class MyDate {
    private int year;
    private int month;
    private int day;
    public static final String [] MONTHS =
            {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final String [] DAYS =
            {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public static final int [] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear (int year){
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

    public static boolean isValidDate (int year, int month, int day) {
        int dayMax = 0;
        if (year < 1 || year > 9999) return false;
        if (month < 1 || month > 12) return false;

        if (month != 2){
            dayMax = DAYS_IN_MONTHS[month-1];
        } else {
            dayMax = isLeapYear(year) ? 29 : 28;
        }

        if (day < 1 || day > dayMax) return false;
        return true;
    }

    public static int getDayOfWeek(int year, int month, int day){
        int[] nonLeapYearMonthNumbers = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int[] leapYearMonthNumbers    = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

        //  1. Find century number based on the first two digits of the year.
        int firstTwoDigits = year / 100;
        int centuryNumber = 6 - 2 * (firstTwoDigits % 4);

        // 2. Find last two digits of the year
        int lastTwoDigits = year % 100;

        // 3. Find year number by dividing last two digit of the year by 4
        int yearNumber = lastTwoDigits / 4;

        // 4. Find month number from the leap / non leap year lists declared at the beginning
        int monthNumber =  isLeapYear(year) ? leapYearMonthNumbers[month-1] : nonLeapYearMonthNumbers[month-1];

        //5. Add (centuryNumber, lastTwoDigits (of year), yearNumber, monthNumber, day) % 7
        int dayOfWeek = (centuryNumber + lastTwoDigits + yearNumber + monthNumber + day) % 7;

        return dayOfWeek;
    }

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public void setDate (int year, int month, int day){
        if (!isValidDate(year,month,day)){
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1 || year > 9999){
            throw new IllegalArgumentException("Invalid year!");
        }
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12){
            throw new IllegalArgumentException("Invalid month!");
        }
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        int dayMax = 0;
        if (month != 2){
            dayMax = DAYS_IN_MONTHS[month-1];
        } else {
            dayMax = isLeapYear(year) ? 29 : 28;
        }

        if (day < 1 || day > dayMax) {
            throw new IllegalArgumentException("Invalid month!");
        }
        this.day = day;
    }

    @Override
    public String toString() {
        return "\"" + DAYS[ getDayOfWeek(year,month,day)] + " "
                + day + " " + MONTHS [month-1] + " " + year +"\"";
    }

    public MyDate nextDay(){
        try {
            setDate(year, month, ++day);
            return this;
        } catch (IllegalArgumentException e) {}


        day = 1;
        return nextMonth();
    }

    public MyDate nextMonth() {
        try {
            setDate(year, ++month, day);
            return this;
        } catch (IllegalArgumentException e) {}

        // Dec to Jan exception
        try {
            setDate(year, month, DAYS_IN_MONTHS[month - 1]);
            return this;
        } catch (IndexOutOfBoundsException e){}
        month = 1;
        return nextYear();
    }

    public MyDate nextYear(){
        try {
            setDate(++year, month, day);
            return this;

        } catch (IllegalArgumentException e) { }

        int dayMax = 0;
        if (month != 2){
            dayMax = DAYS_IN_MONTHS[month-2];
        } else {
            dayMax = isLeapYear(year) ? 29 : 28;
        }
        setDate(year, month, dayMax);
        return this;
    }

    public MyDate previousDay(){
        try {
            setDate(year, month, --day);
            return this;
        } catch (IllegalArgumentException e) {}

        // doesn't work for 29 feb (leap year case)
        day = DAYS_IN_MONTHS[month-2];
        return previousMonth();
    }

    public MyDate previousMonth(){
        try {
            setDate(year, --month, day);
            return this;
        } catch (IllegalArgumentException e) {}

        // doesn't work for 29 feb (leap year case)
        try {
            setDate(year, month, DAYS_IN_MONTHS[month - 2]);
            return this;
        } catch (IndexOutOfBoundsException e){}
        month = 12;
        return previousYear();

    }

    public MyDate previousYear(){
        try {
            setDate(--year, month, day);
            return this;

        } catch (IllegalArgumentException e) {}

        // deals with leap year exception
        int dayMax = 0;
        if (month != 2){
            dayMax = DAYS_IN_MONTHS[month-2];
        } else {
            dayMax = isLeapYear(year) ? 29 : 28;
        }
        setDate(year, month, dayMax);
        return this;
    }
}


