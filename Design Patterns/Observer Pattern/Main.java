public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer binaryObserver = new BinaryObserver(subject);
        System.out.println("15");
        subject.setState(15);
    }
}
