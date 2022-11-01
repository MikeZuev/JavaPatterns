package basepatterns.creational.builder;

public class GamingComputerBuilder extends ComputerBuilder{
    @Override
    void buildName() {
        computer.setName("Monster 2000");
    }

    @Override
    void buildGPU() {
        computer.setGpu("Nvidia rtx 4090");

    }

    @Override
    void buildCPU() {
        computer.setCpu("Intel i9 13900k");

    }

    @Override
    void buildPerformance() {
        computer.setPerformance(Performance.HIGH);
    }
}
