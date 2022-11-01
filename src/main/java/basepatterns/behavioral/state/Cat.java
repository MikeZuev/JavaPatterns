package basepatterns.behavioral.state;

public class Cat {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity(){
        if(activity instanceof Sleep){
            setActivity(new Eat());
        } else if(activity instanceof Eat){
            setActivity(new Play());
        } else if (activity instanceof Play){
            setActivity(new Think());
        } else if (activity instanceof Think){
            setActivity(new Sleep());
        }
    }

    public void doingSomething(){
        activity.doingSomething();
    }
}
