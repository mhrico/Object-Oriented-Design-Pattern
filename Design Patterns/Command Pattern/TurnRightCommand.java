public class TurnRightCommand implements Command{
    public Robot robot;

    public TurnRightCommand(Robot robot){
        this.robot = robot;
    }

    public void execute(){
        robot.turn_right();
    }
}
