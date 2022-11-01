package basepatterns.creational.builder;

public class BuildComputerRunner {
    public static void main(String[] args) {
        Creator creator = new Creator();

        creator.setComputerBuilder(new WorkhorseComputerBuilder());

        Computer computer = creator.buildComputer();
        System.out.println(computer);
    }
}
