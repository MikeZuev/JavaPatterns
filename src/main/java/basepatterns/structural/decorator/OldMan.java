package basepatterns.structural.decorator;

public class OldMan extends HumanDecorator{
    public OldMan(Human human) {
        super(human);
    }

    public String takeCareAboutGrandsons() {
        return " I take care about my grandsons.";
    }

    @Override
    public String live() {
        return super.live() + takeCareAboutGrandsons();
    }
}
