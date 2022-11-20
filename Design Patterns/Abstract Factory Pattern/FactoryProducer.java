public class FactoryProducer {
    public static AbstractFactory getFactory(boolean isRound){
        if(isRound){
            return new ShapeFactory();
        }

        else return new RoundedShapeFactory();
    }
}
