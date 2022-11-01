package basepatterns.creational.builder;

public class WorkhorseComputerBuilder extends ComputerBuilder{

    @Override
    void buildName() {
        computer.setName("old horse");
    }

    @Override
    void buildGPU() {
        computer.setGpu("amd radeon x800");

    }

    @Override
    void buildCPU() {
        computer.setCpu("amd athlon 2000");

    }

    @Override
    void buildPerformance() {
        computer.setPerformance(Performance.LOW);

    }
}
