package basepatterns.behavioral.state;

public class Sleep implements Activity{
    @Override
    public void doingSomething() {
        System.out.println("I am sleeping now.");
    }
}
