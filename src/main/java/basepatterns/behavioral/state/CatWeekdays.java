package basepatterns.behavioral.state;

public class CatWeekdays {
    public static void main(String[] args) {
        Activity activity = new Sleep();
        Cat myCat = new Cat();

        myCat.setActivity(activity);

        for(int i = 0; i < 16; i++){
            myCat.doingSomething();
            myCat.changeActivity();
        }
    }
}
