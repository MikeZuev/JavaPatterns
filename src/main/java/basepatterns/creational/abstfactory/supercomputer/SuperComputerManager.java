package basepatterns.creational.abstfactory.supercomputer;

import basepatterns.creational.abstfactory.Manager;

public class SuperComputerManager implements Manager {
    @Override
    public void manage() {
        System.out.println("Manager of Super Com. company manages production of super computers.");
    }
}
