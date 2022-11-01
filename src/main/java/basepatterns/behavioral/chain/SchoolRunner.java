package basepatterns.behavioral.chain;

public class SchoolRunner {
    public static void main(String[] args) {
        Notifier dailyReport = new DailySchoolReport(Priority.REGULAR);
        Notifier callPhoneReport = new CallPhoneReport(Priority.SERIOUS);
        Notifier faceToFace = new FaceToFaceReport(Priority.VIP);


        dailyReport.setNextNotifier(callPhoneReport);
        callPhoneReport.setNextNotifier(faceToFace);

        dailyReport.notifyParent("All good!", Priority.REGULAR);
        dailyReport.notifyParent("Your kid misbehaved today", Priority.SERIOUS);
        dailyReport.notifyParent("We need to talk about your kid face to face. " +
                "He's done terrible things.", Priority.VIP);


    }
}
