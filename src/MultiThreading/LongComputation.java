package MultiThreading;

import java.math.BigInteger;

public class LongComputation {
    public static void main(String[] args) {
        Power t1 = new  Power(23, 59);
        t1.start();
//        t1.interrupt();
    }

    public static class Power extends Thread {
        private long power;
        private long base;

        public Power(long base, long power) {
            this.power = power;
            this.base = base;
        }

        @Override
        public void run() {
            System.out.println(pow(base, power));
        }

        public long pow( long base, long power) {
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
