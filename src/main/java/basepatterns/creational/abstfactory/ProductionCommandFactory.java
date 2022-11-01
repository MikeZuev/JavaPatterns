package basepatterns.creational.abstfactory;

public interface ProductionCommandFactory {

    Engineer getEngineer();

    Coder getCoder();

    Seller getSeller();

    Manager getManager();
}
