package basepatterns.behavioral.command;

public class WalkCommand implements Command{
    Robot robot;

    public WalkCommand(Robot robot) {
        this.robot = robot;
    }


    @Override
    public void execute() {
        robot.walk();
    }
}
