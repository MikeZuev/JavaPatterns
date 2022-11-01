package basepatterns.behavioral.strategy;

public class DogRunner {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.setActivity(new Sleeping());
        myDog.executeActivity();

        myDog.setActivity(new Playing());
        myDog.executeActivity();

        myDog.setActivity(new Eating());
        myDog.executeActivity();

        myDog.setActivity(new Thinking());
        myDog.executeActivity();

        myDog.setActivity(new Sleeping());
        myDog.executeActivity();

    }
}
