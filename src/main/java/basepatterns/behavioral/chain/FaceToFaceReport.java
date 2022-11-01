package basepatterns.behavioral.chain;

public class FaceToFaceReport extends Notifier{
    public FaceToFaceReport(int levelPriority) {
        super(levelPriority);
    }

    @Override
    public void write(String message) {
        System.out.println("Came to Parents to make report face to face: " + message);

    }
}
