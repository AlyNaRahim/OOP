public class SpacesNumbers {
    public static void main(String[] args) {
        int count = 1;
        int count2 = 4;

        while (count <= 5) {
            int count3 = count2;
            while (count3 >= 0) {
                System.out.print(" ");
                count3--;
            }
            int count4 = count;
            while (count4 > 0) {
                System.out.print(count);
                count4--;
            }
            System.out.println();
            count++;
            count2--;
        }
    }
}
