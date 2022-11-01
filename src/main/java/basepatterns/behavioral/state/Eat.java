package basepatterns.behavioral.state;

public class Eat implements Activity{
    @Override
    public void doingSomething() {
        System.out.println("I am eating now");
    }
}
