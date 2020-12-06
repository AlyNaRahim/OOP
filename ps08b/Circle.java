package ps08b;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
        this.radius = 0.0f;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea () {
        return Math.PI * (radius * radius);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() +
                "radius=" + radius +
                ']';
    }
}
