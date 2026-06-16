package MultiThreading;

import java.math.BigInteger;

public class LongComputation {
    public static void main(String[] args) {
        Power t1 = new Power(new BigInteger("1232344"), new BigInteger("119"));
        t1.setDaemon(true);
        t1.start();
        // this stops thread gracefully
        t1.interrupt();
    }

    public static class Power extends Thread {
        private BigInteger base;
        private BigInteger power;

        public  Power(BigInteger base, BigInteger power) {
            this.base = base;
            this.power = power;
        }

        public void run() {
            System.out.println(base+ "^"+ power+ "=" + getPower(base, power));
        }
        public BigInteger getPower(BigInteger base, BigInteger power) {
            BigInteger res =  BigInteger.ONE;
            for (BigInteger i = BigInteger.ZERO; i.compareTo(base) != 0; i = i.add(BigInteger.ONE)) {
//                if (Thread.currentThread().isInterrupted()) { // to use Thread.interrupt we need isInterrupted
//                    System.out.println("Thread is interrupted");
//                    return BigInteger.ZERO;
//                }
                res = res.multiply(base);
            }
            return res;
        }
    }
}
