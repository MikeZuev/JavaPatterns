package basepatterns.structural.decorator;

public class Adult extends HumanDecorator{
    public Adult(Human human) {
        super(human);
    }

    public String work(){
        return " I am working and try to make some money for my family.";
    }

    @Override
    public String live() {
        return super.live() + work();
    }
}
