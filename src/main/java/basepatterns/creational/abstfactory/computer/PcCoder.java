package basepatterns.creational.abstfactory.computer;

import basepatterns.creational.abstfactory.Coder;

public class PcCoder implements Coder {


    @Override
    public void writeSoftware() {
        System.out.println("Personal computer coder writes pc software.");
    }
}
