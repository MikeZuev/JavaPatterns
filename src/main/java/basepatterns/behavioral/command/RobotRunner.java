package basepatterns.behavioral.command;

public class RobotRunner {
    public static void main(String[] args) {
        Robot robot = new Robot();

        RobotController robotCon = new RobotController(
                new RunCommand(robot),
                new WalkCommand(robot),
                new WorkCommand(robot),
                new ChargeCommand(robot)
        );

        robotCon.runRobot();
        robotCon.walkRobot();
        robotCon.workRobot();
        robotCon.chargeRobot();


    }





}
