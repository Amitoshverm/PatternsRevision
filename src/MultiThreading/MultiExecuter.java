package MultiThreading;

import java.util.ArrayList;
import java.util.List;

public class MultiExecuter {
    // Add any necessary member variables here

    /*
     * @param tasks to executed concurrently
     */
    private List<Runnable> tasks;

    public MultiExecuter(List<Runnable> tasks) {
        this.tasks = tasks;
    }

    /**
     * Starts and executes all the tasks concurrently
     */
    public void executeAll() {
       List<Thread> threads = new ArrayList<>(tasks.size());

       for (Runnable task : tasks) {
           Thread thread = new Thread(task);
           threads.add(thread);
       }

       for (Thread thread : threads) {
           thread.start();
       }
    }
}
