public class TurnLeftCommand implements Command{
    public Robot robot;

    public TurnLeftCommand(Robot robot){
        this.robot = robot;
    }

    public void execute(){
        robot.turn_left();
    }
}
