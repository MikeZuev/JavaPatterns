package basepatterns.behavioral.visitor;

public class SeniorJavaDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Writing the best classes.");
    }

    @Override
    public void create(Database database) {
        System.out.println("Setting database in perfect way.");

    }

    @Override
    public void create(Test test) {
        System.out.println("Writing all tests.");

    }
}
