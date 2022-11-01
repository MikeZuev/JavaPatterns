package basepatterns.behavioral.memento;

public class SaveProjectRunner {
    public static void main(String[] args) {
        Project bestAppEver = new Project();
        GithubRepo githubRepo = new GithubRepo();

        System.out.println("Creating new Best App Ever. Version 1.0");
        bestAppEver.setVersionAndDate("Version 1.0");

        System.out.println(bestAppEver);

        System.out.println("Saving current version of bestAppEver to Github ");

        githubRepo.setSave(bestAppEver.save());

        System.out.println("Updating the bestAppEver to Version 2.0");

        System.out.println("Writing the worst code ever");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        bestAppEver.setVersionAndDate("Version 2.0");

        System.out.println(bestAppEver);

        System.out.println("Something really bad happened");

        System.out.println("Rolling back old version");
        bestAppEver.load(githubRepo.getSave());


        System.out.println("Best app ever after rollback");

        System.out.println(bestAppEver);







    }
}
