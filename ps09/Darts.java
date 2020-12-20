package ps09;

public class Darts {
    private double x;
    private double y;

    public Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public int score(){
        int returnedScore = 0;
        double target = Math.sqrt((x * x) + (y * y));

        if (target <= 10 && target > 5) {
            return 1;
        } else if (target <= 5 && target > 1) {
            return  5;
        } else if (target <= 1) {
            return 10;
        }

        return 0;

    }
}
