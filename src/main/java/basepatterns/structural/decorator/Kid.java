package basepatterns.structural.decorator;

public class Kid implements Human{
    @Override
    public String live() {
        return "I eat every day.";
    }
}
