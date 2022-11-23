public class StopCommand implements Command{
    Robot robot;

    public StopCommand(Robot robot) {
        this.robot = robot;
    }
    
    public void execute(){
        robot.stop();
    }
}
