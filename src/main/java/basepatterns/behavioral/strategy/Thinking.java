package basepatterns.behavioral.strategy;

public class Thinking implements Activity{

    @Override
    public void doingSomething() {
        System.out.println("Thinking about something");
    }
}
