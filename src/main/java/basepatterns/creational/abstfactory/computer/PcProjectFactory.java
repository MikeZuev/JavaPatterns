package basepatterns.creational.abstfactory.computer;

import basepatterns.creational.abstfactory.*;
import basepatterns.creational.abstfactory.*;
import basepatterns.creational.abstfactory.*;

public class PcProjectFactory implements ProductionCommandFactory {
    @Override
    public Engineer getEngineer() {
        return new PcEngineer();
    }

    @Override
    public Coder getCoder() {
        return new PcCoder();
    }

    @Override
    public Seller getSeller() {
        return new PcSeller();
    }

    @Override
    public Manager getManager() {
        return new PcManager();
    }
}
