package basepatterns.creational.abstfactory.supercomputer;

import basepatterns.creational.abstfactory.Engineer;

public class SuperComputerEngineer implements Engineer {
    @Override
    public void creatingHardware() {
        System.out.println("Super Computer engineer makes hardware for super computers.");
    }
}
