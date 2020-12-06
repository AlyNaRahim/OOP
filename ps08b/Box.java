package ps08b;


public class Box implements ToBeStored{
    private double maximumWeight;
    private double maximumWeightTemp;
    private int count;

    public Box(double maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.maximumWeightTemp = maximumWeight;
        this.count = 0;
    }


    @Override
    public double weight() {
        double weight = 0;
        return weight;
    }

    public int add(Book book) {
        if (book.weight() < maximumWeight){
            count += 1;
            maximumWeight -= book.weight();
        }
        return count;
    }

    public int add(CD cd) {
        if (cd.weight() < maximumWeight){
            count += 1;
            maximumWeight -= cd.weight();
        }
        return count;
    }

    @Override
    public String toString() {
        double endWeight = maximumWeightTemp - maximumWeight;
        return "Box: " + count + " things, total weight " + String.format("%.1f", endWeight) + " kg" ;
    }
}
