package basepatterns.behavioral.visitor;

import java.util.Arrays;

public class Project implements ProjectElement{
    ProjectElement [] projectElements;

    public Project() {
        this.projectElements = new ProjectElement[]{
                new ProjectClass(),
                new Database(),
                new Test()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        for(ProjectElement projectElement: projectElements){
            projectElement.beWritten(developer);
        }

    }
}
