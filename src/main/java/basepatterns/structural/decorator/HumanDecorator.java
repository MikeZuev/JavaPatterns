package basepatterns.structural.decorator;

public class HumanDecorator implements Human{
    Human human;

    public HumanDecorator(Human human) {
        this.human = human;
    }

    @Override
    public String live() {
        return human.live();
    }
}
