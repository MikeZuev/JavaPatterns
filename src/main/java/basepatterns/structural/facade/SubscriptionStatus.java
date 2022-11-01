package basepatterns.structural.facade;

public class SubscriptionStatus {
    private boolean subscriptionPayed;

    public boolean isActive() {

        return subscriptionPayed;
    }

    public void subscriptionIsActive() {
        System.out.println("subscription is payed and active.");
        subscriptionPayed = true;
    }

    public void subscriptionIsNotActive() {
        System.out.println("subscription is not payed and active.");
        subscriptionPayed = false;
    }
}
