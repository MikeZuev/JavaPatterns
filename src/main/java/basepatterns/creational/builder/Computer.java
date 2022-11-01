package basepatterns.creational.builder;

public class Computer {

    private String name;

    private String gpu;

    private String cpu;

    private Performance performance;

    public void setName(String name) {
        this.name = name;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setPerformance(Performance performance) {
        this.performance = performance;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", gpu='" + gpu + '\'' +
                ", cpu='" + cpu + '\'' +
                ", performance=" + performance +
                '}';
    }
}
