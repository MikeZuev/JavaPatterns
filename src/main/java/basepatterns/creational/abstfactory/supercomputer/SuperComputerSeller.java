package basepatterns.creational.abstfactory.supercomputer;

import basepatterns.creational.abstfactory.Seller;

public class SuperComputerSeller implements Seller {
    @Override
    public void sellComputer() {
        System.out.println("Seller of super computers sells them.");
    }
}
