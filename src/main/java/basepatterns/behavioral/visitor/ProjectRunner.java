package basepatterns.behavioral.visitor;

public class ProjectRunner {
    public static void main(String[] args) {
        Project myProject = new Project();

        Developer junior = new JuniorJavaDeveloper();
        Developer senior = new SeniorJavaDeveloper();

        System.out.println("Junior's writing project.");
        myProject.beWritten(junior);

        System.out.println("===========================");

        System.out.println("Senior's writing and fixing project.");
        myProject.beWritten(senior);
    }
}
