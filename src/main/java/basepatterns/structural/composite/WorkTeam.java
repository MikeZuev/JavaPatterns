package basepatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class WorkTeam {
    List<Worker> workers = new ArrayList<>();

    public void employNewWorker(Worker worker) {
        workers.add(worker);
    }

    public void fireWorker(Worker worker){
        workers.remove(worker);
    }

    public void buildHouse(){
        System.out.println("Team of workers started building the house.");
        System.out.println("==========================================");
        for(Worker worker : workers){
            worker.work();
        }
    }
}
