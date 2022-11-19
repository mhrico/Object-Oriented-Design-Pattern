public class WalkForwardCommand implements Command{
    public Robot robot;

    public WalkForwardCommand(Robot robot){
        this.robot = robot;
    }

    public void execute(){
        robot.walk_forward();
    }
}
