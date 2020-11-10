package ps07;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime (int hour, int minute, int second) {
        if (!isValidTime(hour, minute, second)){
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23){
            throw new IllegalArgumentException("Invalid hour!");
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59 ) {
            throw new IllegalArgumentException("Invalid minute!");
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59){
            throw new IllegalArgumentException("Invalid second!");
        }
        this.second = second;
    }

    @Override
    public String toString() {
        StringBuilder myTimeString = new StringBuilder();
        String h = String.format("%02d", hour);
        String m = String.format("%02d", minute);
        String s = String.format("%02d", second);

        myTimeString.append(h).append(":").append(m).append(":").append(s);
        return myTimeString.toString();
    }

    public MyTime nextSecond (){
        if (second < 59){
            this.second = second + 1;
            return this;
        }
        second = 0;
        return nextMinute();
    }

    public MyTime nextMinute (){
        if (minute < 59){
            this.minute = minute + 1;
            return this;
        }
        minute = 0;
        return nextHour();
    }

    public MyTime nextHour (){
        if (hour < 23){
            this.hour = hour + 1;
            return this;
        }
        hour = 0;
        return this;
    }

    public MyTime previousSecond (){
        if (second > 0){
            this.second = second - 1;
            return this;
        }
        second = 59;
        return previousMinute();
    }

    public MyTime previousMinute (){
        if (minute > 0){
            this.minute = minute - 1;
            return this;
        }
        minute = 59;
        return previousHour();
    }

    public MyTime previousHour (){
        if (hour > 0){
            this.hour = hour - 1;
            return this;
        }
        hour = 23;
        return this;
    }

    public boolean isValidTime (int hour, int minute, int second) {
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
            return false;
        } else return true;
    }
}
