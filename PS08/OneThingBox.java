package ps08;


import java.util.ArrayList;

public class OneThingBox extends Box{
    private int count;
    ArrayList<Thing> list = new ArrayList<Thing>();

    public OneThingBox(){
        this.count = 0;
    }


    @Override
    public void add(Thing thing) {
        if (this.count == 0){
            list.add(thing);
            count += 1;
        }else {
            System.out.println(thing + " cannot be added");
        }

    }

    @Override
    public boolean isInTheBox(Thing thing) {
        //return this.list.contains(thing);
        for (Thing i : this.list){
            if (i.name.equals(thing.name)){
                return true;
            }
        }
        return false;
    }
}
