package lesson10;

import java.util.Comparator;

public class WorkerFromStageComparator implements Comparator<Worker> {

    @Override
    public int compare(Worker worker1, Worker worker2) {
        return Integer.compare(worker1.getEducation().getStage(), worker2.getEducation().getStage());
    }
}
