package basepatterns.behavioral.strategy;

public class Sleeping implements Activity{
    @Override
    public void doingSomething() {
        System.out.println("Sleeping somewhere");
    }
}
