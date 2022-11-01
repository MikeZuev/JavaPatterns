package basepatterns.structural.bridge;

public class SamsungPhoneMaker implements PhoneMaker{
    @Override
    public void makePhone() {
        System.out.println("Samsung phone maker produces new samsungs ");
    }
}
