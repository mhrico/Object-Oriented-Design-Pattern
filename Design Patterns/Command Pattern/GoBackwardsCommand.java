public class GoBackwardsCommand implements Command{
    public Robot robot;

    public GoBackwardsCommand(Robot robot){
        this.robot = robot;
    }

    public void execute(){
        robot.go_backward();
    }
}
