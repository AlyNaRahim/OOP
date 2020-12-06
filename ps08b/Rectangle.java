package ps08b;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        this.width = 0.0f;
        this.length = 0.0f;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea () {
        return length * width;
    }

    public double getPerimeter (){
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString() +
                "width=" + width +
                ", length=" + length +
                ']';
    }
}
