import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Invoker invoker = new Invoker();
        ArrayList<Command> commands = new ArrayList<>();
        Random random = new Random();

        commands.add(new MoveForwardCommand(robot));
        commands.add(new MoveBackwardsCommand(robot));
        commands.add(new MoveLeftCommand(robot));
        commands.add(new MoveRightCommand(robot));
        commands.add(new StopCommand(robot));


        for(int i = 0; i < 10; i++){
            int index = random.nextInt(commands.size());
            invoker.setCommand(commands.get(index));
            invoker.invoke();
        }
    }
}
