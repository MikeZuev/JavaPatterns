package basepatterns.behavioral.state;

public class Play implements Activity{
    @Override
    public void doingSomething() {
        System.out.println("I am playing now");
    }
}
