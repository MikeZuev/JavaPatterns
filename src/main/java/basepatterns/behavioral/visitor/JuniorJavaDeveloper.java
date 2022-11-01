package basepatterns.behavioral.visitor;

public class JuniorJavaDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Writing the most terrible class ever.");
    }

    @Override
    public void create(Database database) {
        System.out.println("Destroying database.");

    }

    @Override
    public void create(Test test) {
        System.out.println("He doesn't know how to write tests.");

    }
}
