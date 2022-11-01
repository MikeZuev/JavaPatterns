package basepatterns.behavioral.command;

public class RunCommand implements Command{
    Robot robot;

    public RunCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.run();

    }
}
