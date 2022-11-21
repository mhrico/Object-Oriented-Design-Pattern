import java.util.ArrayList;

public class Subject {
    private int state;
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    
    public void attach(Observer observer){
        observers.add(observer);
    }


    public int getState() {
        return state;
    }
    
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for(Observer observer: observers){
            observer.update();
        }
    }


}
