public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("test 10mb.jpg");

        image.display();
        image.display();
    }
}
