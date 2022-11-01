package basepatterns.structural.bridge;

public class SamsungCompany extends Phone{
    protected SamsungCompany(PhoneMaker phoneMaker) {
        super(phoneMaker);
    }

    @Override
    public void makePhone() {
        phoneMaker.makePhone();

    }
}
