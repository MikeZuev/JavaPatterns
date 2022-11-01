package basepatterns.creational.singleton;

public class AirPortRunner {
    public static void main(String[] args) {
        AirTrafficController airTrafficController = AirTrafficController.getAirTrafficController();
        airTrafficController.addRecordAboutAirSituation("First jet will take off in 5 minutes");
        airTrafficController.addRecordAboutAirSituation("Second jet took off 1 hour ago");
        airTrafficController.addRecordAboutAirSituation("Third is taking off now.");
        airTrafficController.getAllRecords();

    }
}
