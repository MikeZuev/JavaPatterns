package basepatterns.creational.builder;

public class Creator {
    ComputerBuilder computerBuilder;

    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    Computer buildComputer() {
        computerBuilder.createComputer();
        computerBuilder.buildName();
        computerBuilder.buildGPU();
        computerBuilder.buildCPU();
        computerBuilder.buildPerformance();

        Computer computer = computerBuilder.getComputer();
        return computer;
    }
}
