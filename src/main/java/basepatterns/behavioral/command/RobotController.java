package basepatterns.behavioral.command;

public class RobotController {
    Command run;
    Command walk;
    Command work;
    Command charge;

    public RobotController(Command run, Command walk, Command work, Command charge) {
        this.run = run;
        this.walk = walk;
        this.work = work;
        this.charge = charge;
    }

    public void runRobot() {
        run.execute();
    }

    public void walkRobot() {
        walk.execute();
    }

    public void workRobot() {
        work.execute();
    }

    public void chargeRobot(){
        charge.execute();
    }
}
