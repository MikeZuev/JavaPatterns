package basepatterns.structural.facade;

public class GameLauncher {
    public static void main(String[] args) {
        GameProcess gameProcess = new GameProcess();
        gameProcess.playGame();

    }
}
