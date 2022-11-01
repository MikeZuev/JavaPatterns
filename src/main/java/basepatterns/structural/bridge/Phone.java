package basepatterns.structural.bridge;

public abstract class Phone {
    protected PhoneMaker phoneMaker;

    protected Phone(PhoneMaker phoneMaker) {
        this.phoneMaker = phoneMaker;
    }

    public abstract void makePhone();
}
