package basepatterns.structural.proxy;

public class UTorrent implements SharingFileSystem{
    private String url;

    public UTorrent(String url) {
        this.url = url;
        download();
    }

    public void download(){
        System.out.println("Downloading game on this link " + url);
    }

    public void installGame() {
        System.out.println("Installing the game.");
    }

    @Override
    public void work() {
        installGame();
        System.out.println("The game was downloaded on this link " + url + " is working");
    }
}
