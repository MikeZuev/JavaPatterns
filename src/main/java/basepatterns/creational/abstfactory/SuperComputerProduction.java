package basepatterns.creational.abstfactory;

import basepatterns.creational.abstfactory.supercomputer.SuperComputerCommandFactory;

public class SuperComputerProduction {
    public static void main(String[] args) {
        ProductionCommandFactory productionCommandFactory = new SuperComputerCommandFactory();
        Engineer engineer = productionCommandFactory.getEngineer();
        Coder coder = productionCommandFactory.getCoder();
        Seller seller = productionCommandFactory.getSeller();
        Manager manager = productionCommandFactory.getManager();

        System.out.println("Starting production of super computers.");

        engineer.creatingHardware();
        coder.writeSoftware();
        seller.sellComputer();
        manager.manage();

    }
}
