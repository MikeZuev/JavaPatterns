package basepatterns.structural.proxy;

public class GameLauncher {

    public static void main(String[] args) {
        String url = "http//www.uTorrent.com/Games/Fallout2";
        SharingFileSystem sharingFileSystem = new ProxyUTorrent(url);

        sharingFileSystem.work();



    }
}
