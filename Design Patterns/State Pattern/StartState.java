public class StartState implements State{
    public void doAction(Context context){
        System.out.println("Player is in start state");
        context.setstate(this);
    }

    public void stateInformation(){
        System.out.println("Start state");
    }
}
