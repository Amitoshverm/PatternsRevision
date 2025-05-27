package MultiThreading;

public class MyRunnable implements Runnable{
    private String task;

    public MyRunnable(String x) {
        this.task = x;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(task +  " is running");
        }
    }
}
