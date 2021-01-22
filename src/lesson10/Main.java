package lesson10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Education education1 = new Education("YSU", 2016, 2020);
        Education education2 = new Education("YSU", 2013, 2019);
        Education education3 = new Education("YSU", 2010, 2018);

        Worker worker1 = new Worker("Karen", "Araqelyan", 21, education1);
        Worker worker2 = new Worker("Ashot", "Gabrielyan", 22, education1);
        Worker worker3 = new Worker("Emma", "Harutyunyan", 23, education2);
        Worker worker4 = new Worker("Hayk", "Petrosyan", 24, education2);
        Worker worker5 = new Worker("Artur", "Harutyunyan", 27, education3);
        Worker worker6 = new Worker("Aram", "Gasparyan", 28, education3);

        Worker[] workers = new Worker[]{worker1, worker2, worker3, worker4, worker5, worker6};
        System.out.println();
        for (Worker w:workers
             ) {
            w.print();
        }
        System.out.println();
        System.out.println("sort");
        System.out.println();
        printSort(workers);
        System.out.println();
        System.out.println("printCount");
        System.out.println();
        printCount(workers);
    }

    public static void printSort(Worker[] workers){
        Arrays.sort(workers,new WorkerFromStageComparator());
        for (Worker w:workers
             ) {
            System.out.println(w);
        }
    }

    public static void printCount(Worker[] workers){
        for (Worker w:workers
             ) {
            if(w.getEducation().getStage()>5){
                System.out.println(w);
            }
        }
    }
}