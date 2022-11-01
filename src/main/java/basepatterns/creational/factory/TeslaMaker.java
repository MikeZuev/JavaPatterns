package basepatterns.creational.factory;

public class TeslaMaker implements CarMaker{
    @Override
    public void makeCar() {
        System.out.println("Tesla Maker makes a Tesla");
    }
}
