package basepatterns.creational.abstfactory.supercomputer;

import basepatterns.creational.abstfactory.*;
import basepatterns.creational.abstfactory.*;
import basepatterns.creational.abstfactory.*;

public class SuperComputerCommandFactory implements ProductionCommandFactory {
    @Override
    public Engineer getEngineer() {
        return new SuperComputerEngineer();
    }

    @Override
    public Coder getCoder() {
        return new SuperComputerCoder();
    }

    @Override
    public Seller getSeller() {
        return new SuperComputerSeller();
    }

    @Override
    public Manager getManager() {
        return new SuperComputerManager();
    }
}
