package basepatterns.creational.abstfactory.computer;

import basepatterns.creational.abstfactory.Manager;

public class PcManager implements Manager {
    @Override
    public void manage() {
        System.out.println("Personal computer manager manages the Pc production");
    }
}
