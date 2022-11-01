package basepatterns.behavioral.command;

public class WorkCommand implements Command{
    Robot robot;

    public WorkCommand(Robot robot) {
        this.robot = robot;
    }


    @Override
    public void execute() {
        robot.work();
    }
}
