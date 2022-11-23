public class MoveRightCommand implements Command{
    Robot robot;

    public MoveRightCommand(Robot robot) {
        this.robot = robot;
    }
    
    public void execute(){
        robot.moveRight();
    }
}
