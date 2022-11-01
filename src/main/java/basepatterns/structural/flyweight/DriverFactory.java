package basepatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DriverFactory {
    private static final Map<String, Driver> drivers = new HashMap<>();

    public Driver getDriverByHisExp(String exp){
        Driver driver = drivers.get(exp);

        if(driver == null){
            switch(exp){
                case"racer":
                    System.out.println("we found a real racer!");
                    driver = new Racer();
                    break;
                case"taxi":
                    System.out.println("we found a taxi driver.");
                    driver = new TaxiDriver();
                    break;
            }
            drivers.put(exp, driver);
        }

        return driver;
    }
}
