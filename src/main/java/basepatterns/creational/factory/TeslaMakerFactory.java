package basepatterns.creational.factory;

public class TeslaMakerFactory implements CarMakerFactory{
    @Override
    public CarMaker createCarMaker() {
        return new TeslaMaker();
    }
}
