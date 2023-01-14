package pt.leo.singleton;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PrintSpooler {
    private static PrintSpooler instance;
    private PrintSpooler() {
    }

    static String printerAddress;
    Queue<String> jobQueue = new LinkedList<>();

    private static void init() {
        printerAddress = "10.153.25.22";
    }

    public static PrintSpooler getInstance() {
        // In a multithreading environment we should synchronize this method, to prevent having two threads
        // creating their own instance, which defeats the purpose of a singleton.
        if (instance == null) {
            instance = new PrintSpooler();
            init();
        }
        return instance;
    }

    public void addJob(String job) {
        jobQueue.add(job);
    }

    public List<String> getJobs() {
        return jobQueue.stream().toList();
    }
}
