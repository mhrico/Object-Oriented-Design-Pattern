import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Robot robot = new Robot();

        ArrayList<Command> commands = new ArrayList<>();
        WalkForwardCommand walkForwardCommand = new WalkForwardCommand(robot);
        commands.add(walkForwardCommand);
        GoBackwardsCommand goBackwardsCommand = new GoBackwardsCommand(robot);
        commands.add(goBackwardsCommand);
        TurnLeftCommand turnLeftCommand = new TurnLeftCommand(robot);
        commands.add(turnLeftCommand);
        TurnRightCommand turnRightCommand = new TurnRightCommand(robot);
        commands.add(turnRightCommand);
        StopCommand stopCommand = new StopCommand(robot);
        commands.add(stopCommand);

        while(true){
            Collections.shuffle(commands);
            for(Command command: commands){
                invoker.setCommand(command);
                invoker.execute();
                try{
                    Thread.sleep(1000);
                } catch(Exception e) {
                    System.out.println(e);
                }
            }
        }
        
    }
}
