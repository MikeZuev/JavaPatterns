package basepatterns.creational.factory;

public class JeepMakerFactory implements CarMakerFactory{
    @Override
    public CarMaker createCarMaker() {
        return new JeepMaker();
    }
}
