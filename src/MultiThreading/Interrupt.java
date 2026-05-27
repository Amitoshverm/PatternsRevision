package MultiThreading;

public class Interrupt {
    public static void main(String[] args) {

        Thread thread = new Thread(new BlockThread());
        thread.start();
        thread.interrupt();
    }

    public static class BlockThread implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(50000);
            } catch (InterruptedException e) {
                System.out.println("exiting blocking thread");
            }
        }
    }

}
