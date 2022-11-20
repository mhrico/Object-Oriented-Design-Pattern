public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        System.out.println("Normal Circle: ");
        circle.draw();

        System.out.println("Red Circle: ");
        redCircle.draw();
    }
}
