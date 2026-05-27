package MultiThreading;

import java.math.BigInteger;

public class LongComputation {
    public static void main(String[] args) {
        Power t1 = new  Power();
        t1.start();
        t1.interrupt();
    }

    public static class Power extends Thread {
        @Override
        public void run() {
            System.out.println(pow(23, 10));
        }
        public long pow(long base, long power) {
            for (long i = 1; i < power; i++) {
                if (Thread.interrupted()) {
                    System.out.println("interrupted");
                    return 0;
                }
                base = base * base;
            }
            return base;
        }
    }
}
