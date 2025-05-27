package MultiThreading;

public class MyThread extends Thread{

    String task;

    public MyThread(String task) {
        this.task = task;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(task + " is running and thread name is " + Thread.currentThread().getName() );

            try{
                Thread.sleep(500);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
