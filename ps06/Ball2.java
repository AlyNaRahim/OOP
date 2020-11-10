package ps06;

public class Ball2 {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball2(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta =  speed * (float) Math.cos(Math.toRadians(direction));
        this.yDelta = - speed * (float) Math.sin(Math.toRadians(direction));
    }

    public float getX() {
        return (int) x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return (int) y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move(){
        x += xDelta;
        y += yDelta;
    }

    public void reflectHorizontal () {
        xDelta = -xDelta;
    }

    public void reflectVertical (){
        yDelta = -yDelta;
    }

    public int getSpeed() {
        return (int) Math.sqrt((xDelta * xDelta) + (yDelta * yDelta));
    }

    public int getDirection() {
        return (int) Math.toDegrees(Math.atan2(-yDelta, xDelta));
    }

    @Override
    public String toString() {
        return "Ball at " +
                "(" + (int) x +
                "," + (int) y +  ")" + " of velocity " +
                "(" + getSpeed() +
                "," + getDirection() +  ")";
    }
}
