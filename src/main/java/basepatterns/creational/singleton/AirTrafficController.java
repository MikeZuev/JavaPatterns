package basepatterns.creational.singleton;

public class AirTrafficController {
    private static AirTrafficController airTrafficController;
    private static String airSituation = "Air situation: \n";

    public static synchronized AirTrafficController getAirTrafficController(){
        if(airTrafficController == null) {
            airTrafficController = new AirTrafficController();
        }
        return airTrafficController;
    }

    public void addRecordAboutAirSituation(String record){
        airSituation+= record + "\n";
    }

    public void getAllRecords(){
        System.out.println(airSituation);
    }

}
