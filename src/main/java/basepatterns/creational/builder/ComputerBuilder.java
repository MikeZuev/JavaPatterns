package basepatterns.creational.builder;

public abstract class ComputerBuilder {
    Computer computer;

    void createComputer() {
        computer = new Computer();
    }

    abstract void buildName();
    abstract void buildGPU();
    abstract void buildCPU();
    abstract void buildPerformance();

    Computer getComputer(){
        return computer;
    }
}
