public class MoveForwardCommand implements Command{
    Robot robot;

    public MoveForwardCommand(Robot robot) {
        this.robot = robot;
    }
    
    public void execute(){
        robot.moveForward();
    }
}
