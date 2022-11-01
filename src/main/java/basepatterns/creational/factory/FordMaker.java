package basepatterns.creational.factory;

public class FordMaker implements CarMaker{
    @Override
    public void makeCar() {
        System.out.println("Ford Maker makes a Ford");
    }
}
