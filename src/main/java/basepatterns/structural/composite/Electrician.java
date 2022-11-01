package basepatterns.structural.composite;

public class Electrician implements Worker {
    @Override
    public void work() {
        System.out.println("Electrician set up electricity in the house.");
    }
}
