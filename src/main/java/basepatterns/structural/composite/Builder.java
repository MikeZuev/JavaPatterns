package basepatterns.structural.composite;

public class Builder implements Worker {
    @Override
    public void work() {
        System.out.println("Builder builds the house.");
    }
}
