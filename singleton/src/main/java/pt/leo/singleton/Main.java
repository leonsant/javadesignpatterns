package pt.leo.singleton;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PrintSpooler ps = PrintSpooler.getInstance();
        System.out.println("The print spooler object: " + ps);
        System.out.println("Adding job 1 ...");
        ps.addJob("Job 1");
        System.out.println("Jobs on queue: " + ps.getJobs());

        PrintSpooler ps2 = PrintSpooler.getInstance();
        System.out.println("The print spooler object: " + ps2);
        System.out.println("Adding job 2 ...");
        ps2.addJob("Job 2");
        System.out.println("Jobs on queue: " + ps2.getJobs());
    }
}
