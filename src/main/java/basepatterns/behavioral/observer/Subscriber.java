package basepatterns.behavioral.observer;

import java.util.List;

public class Subscriber implements Observer{

    String name;

    public Subscriber(String name) {
        this.name = name;
    }


    @Override
    public void handleEvent(List<String> cars) {
        System.out.println("Our subscriber " + name + " there are some changes in the cars" + cars);
        System.out.println("=======================================================================");


    }
}
