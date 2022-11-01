package basepatterns.creational.factory;

public class JeepMaker implements CarMaker{


    @Override
    public void makeCar() {
        System.out.println("Jeep Maker makes a Jeep");
    }
}
