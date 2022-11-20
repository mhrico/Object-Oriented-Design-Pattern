public class StopState implements State{
    public void doAction(Context context){
        System.out.println("Player is in stop state");
        context.setstate(this);
    }

    public void stateInformation(){
        System.out.println("Stop state");
    }
}
