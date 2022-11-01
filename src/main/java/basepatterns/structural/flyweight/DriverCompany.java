package basepatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class DriverCompany {
    public static void main(String[] args) {
        DriverFactory driverFactory = new DriverFactory();

        List<Driver> carDrivers = new ArrayList<>();

        carDrivers.add(driverFactory.getDriverByHisExp("racer"));
        carDrivers.add(driverFactory.getDriverByHisExp("racer"));
        carDrivers.add(driverFactory.getDriverByHisExp("racer"));


        carDrivers.add(driverFactory.getDriverByHisExp("taxi"));
        carDrivers.add(driverFactory.getDriverByHisExp("taxi"));

        iter(carDrivers);
        }

    public static void iter(List<Driver> lst) {
        for(Driver driver : lst) {
            driver.drive();
        }
    }

}




