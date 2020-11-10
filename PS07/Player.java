package ps07;

public class Player {
    private int number;
    private float x;
    private float y;
    private float z;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
        this.z = 0.0f;
    }
     public void move (float xDisp, float yDisp){
        this.x += xDisp;
        this.y += yDisp;
     }

     public void jump (float zDisp){
        this.z += zDisp;
     }

     public boolean near (Ball ball){
         double xValue = Math.pow((ball.getX() - x),2);
         double yValue = Math.pow((ball.getY() - y),2);
         double zValue = Math.pow((ball.getZ() - z),2);

         return Math.sqrt((xValue + yValue + zValue)) < 8;
     }

     public void kick (Ball ball){
        // (OPTION 1) assuming that the input of kick method are the final coordinates after the ball is kicked then
         // Also assuming that the ball hits the ground so the distance from player and ball after its kicked will be

         double xValue = Math.pow((ball.getX() - x),2);
         double yValue = Math.pow((ball.getY() - y),2);

         double distanceAfterKick = Math.sqrt((xValue + yValue));


         // (OPTION 2) checking if a player can kick the ball
         // Assuming that the distance is in steps

         if (near(ball)){
             System.out.println("Can Kick");
         } else {
             System.out.println("Too far");
         }

     }
}
