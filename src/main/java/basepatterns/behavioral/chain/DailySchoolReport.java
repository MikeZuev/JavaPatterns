package basepatterns.behavioral.chain;

public class DailySchoolReport extends Notifier{
    public DailySchoolReport(int levelPriority) {
        super(levelPriority);
    }

    @Override
    public void write(String message) {
        System.out.println("Regular daily report: " + message);

    }
}
