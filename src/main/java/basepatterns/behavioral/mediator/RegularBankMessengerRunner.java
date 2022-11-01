package basepatterns.behavioral.mediator;

public class RegularBankMessengerRunner {
    public static void main(String[] args) {
        TextBankMessenger bankMessenger = new TextBankMessenger();

        Bank bankAmin = new BankAdmin(bankMessenger, "Jack");

        Bank bankFirst = new RegularBank(bankMessenger, "bankFirst");

        Bank bankSecond = new RegularBank(bankMessenger, "bankSecond");

        bankMessenger.setBankAdmin(bankAmin);

        bankMessenger.addBankToMessenger(bankFirst);
        bankMessenger.addBankToMessenger(bankSecond);

        bankSecond.sendMessage("Welcome to me. I am the bankFirst");

    }
}
