package ps08;

import java.util.Objects;

public class Thing {
    protected String name;
    protected double weight;

    public Thing(String name, double weight){
        this.name = name;
        if (weight < 0){
            throw new IllegalArgumentException("weight cannot be less than zero");
        }else {
            this.weight = weight;
        }
    }

    public Thing(String name){
        this.name = name;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Thing thing = (Thing) obj;
        return Double.compare(thing.weight, weight) == 0 && Objects.equals(name, thing.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    @Override
    public String toString() {
        return "Thing{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
