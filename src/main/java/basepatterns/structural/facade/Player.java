package basepatterns.structural.facade;

public class Player {

    public void playTheGame(SubscriptionStatus subscriptionStatus) {
        if(subscriptionStatus.isActive()) {
            System.out.println("Player plays the game");
        } else {
            System.out.println("Player reads interesting books!");
        }
    }
}
