package basepatterns.creational.factory;

public class CarRunner {
    public static void main(String[] args) {
       CarMakerFactory carMakerFactory = createCarMakerFactoryByModel("jeep");

        CarMaker carMaker = carMakerFactory.createCarMaker();

        carMaker.makeCar();

    }
    static CarMakerFactory createCarMakerFactoryByModel(String model) {
        if(model.equalsIgnoreCase("tesla")){
            return new TeslaMakerFactory();
        } else if (model.equalsIgnoreCase("ford")){
            return new FordMakerFactory();
        } else if (model.equalsIgnoreCase("jeep")){
            return new JeepMakerFactory();
        }
        else {
            throw new RuntimeException(model + " does not exist");
        }
    }
}
