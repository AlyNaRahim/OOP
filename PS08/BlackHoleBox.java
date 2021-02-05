package ps08;

import java.util.ArrayList;

public class BlackHoleBox extends Box{
    ArrayList<Thing> list = new ArrayList<Thing>();


    @Override
    public void add(Thing thing) {
        list.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}
