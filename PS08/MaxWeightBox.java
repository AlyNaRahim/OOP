package ps08;

import java.util.ArrayList;

public class MaxWeightBox extends Box{
    private int maxWeight;
    private int weight;
    private ArrayList<Thing> list = new ArrayList<Thing>();


    public MaxWeightBox(int maxWeight){
        this.maxWeight=maxWeight;
        this.weight=0;
    }

    @Override
    public void add(Thing thing) {
        if (this.weight + thing.weight <= this.maxWeight){
            list.add(thing);
            this.weight += thing.weight;
        }else {
            System.out.println(thing + " cannot be added");
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        for (Thing i : this.list){
            if (i.name.equals(thing.name)){
                return true;
            }
        }
        return false;
    }
}
