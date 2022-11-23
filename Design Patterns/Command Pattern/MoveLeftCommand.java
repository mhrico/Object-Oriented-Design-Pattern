public class MoveLeftCommand implements Command{
    Robot robot;

    public MoveLeftCommand(Robot robot) {
        this.robot = robot;
    }
    
    public void execute(){
        robot.moveLeft();
    }
}
