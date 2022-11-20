public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        StartState startState = new StartState();
        startState.doAction(context);

        context.getState().stateInformation();

        StopState stopState = new StopState();
        stopState.doAction(context);

        context.getState().stateInformation();
    }
}
