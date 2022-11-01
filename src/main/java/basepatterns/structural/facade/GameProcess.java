package basepatterns.structural.facade;

public class GameProcess {
    Game game = new Game();
    Player player  = new Player();
    SubscriptionStatus status = new SubscriptionStatus();

    public void playGame() {
        game.gameRunning();
        status.subscriptionIsActive();
        player.playTheGame(status);
    }

}
