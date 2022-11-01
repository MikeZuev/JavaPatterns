package basepatterns.structural.composite;

public class House {
    public static void main(String[] args) {

        WorkTeam workTeam = new WorkTeam();

        Worker builder = new Builder();
        Worker electrician = new Electrician();
        Worker welder = new Welder();

        workTeam.employNewWorker(builder);
        workTeam.employNewWorker(electrician);
        workTeam.employNewWorker(welder);

        workTeam.buildHouse();

    }
}
