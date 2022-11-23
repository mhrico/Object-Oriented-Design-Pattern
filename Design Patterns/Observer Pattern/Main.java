public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);

        System.out.println("New state: 15");
        subject.setState(15);
        System.out.println("New state: 20");
        subject.setState(20);

    }
}
