package basepatterns.structural.proxy;

public class ProxyUTorrent implements SharingFileSystem{
    private String url;
    UTorrent uTorrent;

    public ProxyUTorrent(String url) {
        this.url = url;
    }



    @Override
    public void work() {
        if(uTorrent == null) {
            uTorrent = new UTorrent(url);
        }


        uTorrent.work();


    }
}
