package basepatterns.creational.abstfactory.computer;

import basepatterns.creational.abstfactory.Engineer;

public class PcEngineer implements Engineer {
    @Override
    public void creatingHardware() {
        System.out.println("Personal computer engineer makes  pc hardware.");
    }
}
