package basepatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class TextBankMessenger implements BanksMessenger{
        Bank bankAdmin;
        List<Bank> banks = new ArrayList<>();

        public void setBankAdmin(Bank bankAdmin) {
            this.bankAdmin = bankAdmin;
        }

        public void addBankToMessenger(Bank bank){
            this.banks.add((bank));

        }


    @Override
    public void SendMessage(String message, Bank bank) {
        for(Bank b: banks){
            if(b!= bank){
                b.getMessage(message);
            }

        }
        bankAdmin.getMessage(message);
    }
}
