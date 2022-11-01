package basepatterns.structural.bridge;

public class AppleCompany extends Phone{
    protected AppleCompany(PhoneMaker phoneMaker) {
        super(phoneMaker);
    }

    @Override
    public void makePhone() {
        phoneMaker.makePhone();

    }
}
