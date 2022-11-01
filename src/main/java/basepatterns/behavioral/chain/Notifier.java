package basepatterns.behavioral.chain;

public abstract class Notifier{
    private int levelPriority;

    private Notifier nextNotifier;

    public Notifier(int levelPriority) {
        this.levelPriority = levelPriority;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public void notifyParent(String message, int priority) {
        if (priority >= levelPriority) {
            write(message);
        }
        if (nextNotifier != null) {
            nextNotifier.notifyParent(message, priority);
        }

    }


    public abstract void write(String message);
}
