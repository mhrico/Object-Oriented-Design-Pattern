public class MoveBackwardsCommand implements Command{
    Robot robot;

    public MoveBackwardsCommand(Robot robot) {
        this.robot = robot;
    }
    
    public void execute(){
        robot.moveBackwards();
    }
}
