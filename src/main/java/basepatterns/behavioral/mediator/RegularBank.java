package basepatterns.behavioral.mediator;

public class RegularBank implements Bank{
    BanksMessenger banksMessenger;
    String name;

    public RegularBank(BanksMessenger banksMessenger, String name) {
        this.banksMessenger = banksMessenger;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        banksMessenger.SendMessage(message, this);

    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name + "receiving message " + message);

    }
}
