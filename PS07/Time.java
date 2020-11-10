package ps07;

public class Time {
    private int hour;
    private int minute;
    private int second;


    public Time(int hour, int minute, int second) {
        if (!isValidTime(hour, minute, second)){
            throw new IllegalArgumentException();
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime (int hour, int minute, int second) {
        if (!isValidTime(hour, minute, second)){
            throw new IllegalArgumentException();
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        StringBuilder timeString = new StringBuilder();
        String h = String.format("%02d", hour);
        String m = String.format("%02d", minute);
        String s = String.format("%02d", second);

        if (!isValidTime(hour, minute, second)) {
            throw new IllegalArgumentException();
        }
        timeString.append(h).append(":").append(m).append(":").append(s);
        return timeString.toString();
    }

    public Time nextSecond (){
        this.hour = hour;
        this.minute = minute;
        this.second = second + 1;

        return new Time(hour, minute, second);
    }

    public Time previousSecond (){
        this.hour = hour;
        this.minute = minute;
        this.second = second - 1;

        return new Time(hour, minute, second);
    }

    public boolean isValidTime (int hour, int minute, int second) {
        if (hour < 0 || hour > 24 || minute < 0 || minute > 60 || second < 0 || second > 60) {
            return false;
        } else return true;
    }

}
