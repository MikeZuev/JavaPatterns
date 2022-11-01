package basepatterns.behavioral.command;

public class ChargeCommand implements Command{
    Robot robot;


    public ChargeCommand(Robot robot) {
        this.robot = robot;
    }


    @Override
    public void execute() {
        robot.charge();
    }
}
