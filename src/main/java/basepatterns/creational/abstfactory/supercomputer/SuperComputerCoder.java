package basepatterns.creational.abstfactory.supercomputer;

import basepatterns.creational.abstfactory.Coder;

public class SuperComputerCoder implements Coder {
    @Override
    public void writeSoftware() {
        System.out.println("Super Computer coder writes software for super computers.");
    }
}
