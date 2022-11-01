package basepatterns.structural.bridge;

public class ApplePhoneMaker implements PhoneMaker{
    @Override
    public void makePhone() {
        System.out.println("Apple phone maker produces iphones.");
    }
}
