package ps07;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY (){
        return new int[]{x, y};
    }

    public void setXY (int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x +
                "," + y +
                ')';
    }

    public double distance (int x1, int y1){
        double xValue = Math.pow((x1 - x),2);
        double yValue = Math.pow((y1 - y),2);

        return Math.sqrt((xValue + yValue));
    }

    public double distance (MyPoint another){
        double xValue = Math.pow((another.x - x),2);
        double yValue = Math.pow((another.y - y),2);

        return Math.sqrt((xValue + yValue));
    }

    public double distance (){
        double xValue = Math.pow(x,2);
        double yValue = Math.pow(y,2);

        return Math.sqrt((xValue + yValue));
    }
}
