package basepatterns.creational.abstfactory.computer;

import basepatterns.creational.abstfactory.Seller;

public class PcSeller implements Seller {
    @Override
    public void sellComputer() {
        System.out.println("Personal computer seller sells personal computers.");
    }
}
