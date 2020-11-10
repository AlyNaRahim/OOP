package ps06;

public class ResistorColor {
    int colorCode(String color) {
        color = color.toLowerCase();
        String[] a = {"black", "brown", "red", "orange", "yellow", "green","blue", "violet", "grey","white"};

        for (int i = 0; i < a.length; i++){
            if (a[i].equals(color)){
                return i;
            }
        }
        return -1;
    }

    String[] colors() {
        String[] a = {"black", "brown", "red", "orange", "yellow", "green","blue", "violet", "grey","white"};
        return a;
    }
}
