package ps08;

public class Cylinder extends CircleOne {
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double radius) {
        super(radius);
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea(){
        return (2 * Math.PI * getRadius() * (getRadius() + getHeight()));
    }

    public double getVolume (){
        return super.getArea() * getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }
}
