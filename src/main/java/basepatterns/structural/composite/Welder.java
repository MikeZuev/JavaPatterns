package basepatterns.structural.composite;

public class Welder implements Worker {
    @Override
    public void work() {
        System.out.println("Welder welds the metal constructions in the house.");
    }
}
