package basepatterns.creational.factory;

public class FordMakerFactory implements CarMakerFactory{
    @Override
    public CarMaker createCarMaker() {
        return new FordMaker();
    }
}
