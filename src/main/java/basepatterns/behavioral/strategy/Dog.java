package basepatterns.behavioral.strategy;

public class Dog {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity(){
        activity.doingSomething();
    }
}
