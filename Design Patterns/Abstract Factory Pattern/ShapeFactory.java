public class ShapeFactory extends AbstractFactory {
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        
        else if(shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }

        else return null;
    }
}
