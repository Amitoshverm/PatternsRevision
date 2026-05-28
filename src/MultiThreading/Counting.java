package MultiThreading;

public class Counting {
    public static void main(String[] args) {

        Thread t = new  Thread(new Runnable() {
            public void run() {

                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("daemon thread is working");
                }
            }
        });

        t.setDaemon(true);
        t.start();
        System.out.println("main thread work is done");
//        for (int i = 101; i <= 110; i++) {
//            System.out.println(i);
//        }
    }

}
