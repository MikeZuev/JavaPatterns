package basepatterns.behavioral.state;

public class Think implements Activity{
    @Override
    public void doingSomething() {
        System.out.println("I am thinking now");
    }
}
