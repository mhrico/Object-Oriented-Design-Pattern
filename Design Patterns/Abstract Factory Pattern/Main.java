public class Main {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(true);
        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(false);

        Shape rectangle = shapeFactory.getShape("Rectangle");
        Shape square = shapeFactory.getShape("Square");
        Shape roundedRectangle = roundedShapeFactory.getShape("Rectangle");
        Shape roundedSquare = roundedShapeFactory.getShape("Square");

        rectangle.draw();
        square.draw();
        roundedRectangle.draw();
        roundedSquare.draw();
    }
}
