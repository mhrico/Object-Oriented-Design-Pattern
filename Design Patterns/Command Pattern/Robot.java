public class Robot{
    private int x, y;

    public Robot(){
        System.out.println("Initialized robot at 0, 0");
    }
    public void moveForward(){
        System.out.println("Moving forward. Position: " + ++x + ", " + y);
    }

    public void moveBackwards(){
        System.out.println("Moving backwards. Position: " + --x + ", " + y);
    }

    public void moveLeft(){
        System.out.println("Moving left. Position: " + x + ", " + ++y);
    }

    public void moveRight(){
        System.out.println("Moving right. Position: " + x + ", " + --y);
    }

    public void stop(){
        System.out.println("Stopped");
    }
}