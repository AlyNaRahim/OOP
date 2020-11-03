import java.util.Scanner;

public class RockPaper {
    public static void main(String[] args) {
        winner();
    }

    public static void winner() {
        Scanner input = new Scanner(System.in);
        System.out.print("Player1: ");
        String user1 = input.nextLine();
        System.out.print("Player2: ");
        String user2 = input.nextLine();

        if (user1.equals(user2)){
            System.out.println("Draw");
        }
        else if ((user1.equals("sc") && user2.equals("pp")) || (user1.equals("rc") && user2.equals("sc"))||
                (user1.equals("pp") && user2.equals("rc"))){
            System.out.println("Winner is Player1");
        } else {
            System.out.println("Winner is Player2");
        }
    }
}
