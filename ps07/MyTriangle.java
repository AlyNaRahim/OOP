package ps07;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1=" + v1.toString() +
                ", v2=" + v2.toString() +
                ", v3=" + v3.toString() +
                ']';
    }

    public double getPerimeter(){
        double distance12 = v1.distance(v2);
        double distance13 = v1.distance(v3);
        double distance23 = v2.distance(v3);

        return distance12 + distance13 + distance23;
    }

    public String getType (){
        final String [] type = {"Equilateral", "Scalene", "Isosceles"};
        double side1 = v1.distance(v2);
        double side2 = v1.distance(v3);
        double side3 = v2.distance(v3);

        if (side1 == side2 && side2 == side3){
            return type[0];
        } else if (side1 != side2 && side1 != side3 && side2 != side3){
            return type[1];
        } else {
            return type[2];
        }
    }
}
