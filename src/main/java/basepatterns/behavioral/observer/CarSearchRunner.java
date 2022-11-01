package basepatterns.behavioral.observer;

public class CarSearchRunner {
    public static void main(String[] args) {
        FordCarsApp fordCarsApp = new FordCarsApp();

        fordCarsApp.addCar("Ford Mustang");
        fordCarsApp.addCar("Ford Focus");

        Subscriber firstObserver = new Subscriber("Bob");
        Subscriber secondObserver = new Subscriber("Mike");

        fordCarsApp.addObserver(firstObserver);
        fordCarsApp.addObserver(secondObserver);

        fordCarsApp.addCar("Ford Turbo Mustang");

        fordCarsApp.removeCar("Ford Focus");



    }
}
