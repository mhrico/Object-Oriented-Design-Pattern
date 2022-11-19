public class StopCommand implements Command{
    public Robot robot;

    public StopCommand(Robot robot){
        this.robot = robot;
    }

    public void execute(){
        robot.stop();
    }
}
