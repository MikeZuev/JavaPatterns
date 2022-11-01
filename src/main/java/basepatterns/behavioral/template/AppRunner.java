package basepatterns.behavioral.template;

public class AppRunner {
    public static void main(String[] args) {
        AppTemplate pageMain = new AppMainMenu();
        AppTemplate gamesPage = new GamesPage();

        pageMain.showPage();
        System.out.println("-----------------");
        gamesPage.showPage();
    }
}
