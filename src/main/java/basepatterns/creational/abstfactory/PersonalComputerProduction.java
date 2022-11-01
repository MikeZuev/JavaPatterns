package basepatterns.creational.abstfactory;

import basepatterns.creational.abstfactory.computer.PcProjectFactory;

public class PersonalComputerProduction {
    public static void main(String[] args) {
        ProductionCommandFactory  productionCommandFactory = new PcProjectFactory();
        Engineer engineer = productionCommandFactory.getEngineer();
        Coder coder = productionCommandFactory.getCoder();
        Seller seller = productionCommandFactory.getSeller();
        Manager manager = productionCommandFactory.getManager();

        System.out.println("Starting production of personal computers!");

        engineer.creatingHardware();
        coder.writeSoftware();
        seller.sellComputer();
        manager.manage();
    }
}
