public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setstate(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
