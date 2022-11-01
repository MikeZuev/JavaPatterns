package basepatterns.behavioral.chain;

public class CallPhoneReport extends Notifier{
    public CallPhoneReport(int levelPriority) {
        super(levelPriority);
    }

    @Override
    public void write(String message) {
        System.out.println("Calling: " + message);


    }
}
