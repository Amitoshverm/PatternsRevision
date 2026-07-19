package MultiThreading;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreadCoordination {
     public static void main(String[] args) throws InterruptedException {

         List<Long> inputNumbers = Arrays.asList(0L, 1000L, 133L, 22L, 3L, 41111L, 52222L, 62332L, 7332L, 8331L);
         List<FactorialThread>  threads = new ArrayList<>();
         for (Long num : inputNumbers) {
             threads.add(new FactorialThread(num));
         }

         for (Thread thread : threads) {
             thread.setDaemon(true);
             thread.start();
         }
         for (Thread thread : threads) {

             thread.join(2000);
         }
         for (int i = 0; i < inputNumbers.size(); i++) {
             FactorialThread factorialThread = threads.get(i);
             if (factorialThread.isFinished()) {
                 System.out.println("factorial of "+ inputNumbers.get(i) +" is "+ factorialThread.getResult());
             }
             else {
                 System.out.println("the calculation for "+ inputNumbers.get(i)+ " is in progress");
             }
         }

//       Thread a = new  Thread(new A());
//       Thread b = new  Thread(new B());
//        System.out.println(Thread.currentThread().getName());
//
//        b.start();
//       a.start();
//       b.start();
    }

    public static class FactorialThread extends Thread {
         private long input;
         private BigInteger result =  BigInteger.ZERO;
         private boolean isFinished = false;

         public FactorialThread(long input) {
             this.input = input;
         }
         @Override
         public void run() {
             this.result = getFactorial(input);
             this.isFinished = true;
         }

         public BigInteger getFactorial(long n) {
             BigInteger tempResult = BigInteger.ONE;

             for (long i = n; i > 0; i--) {
                 tempResult = tempResult.multiply(new BigInteger(Long.toString(i)));
             }
             return tempResult;
         }
         public boolean isFinished() {
             return isFinished;
         }

         public BigInteger getResult() {
             return result;
         }

    }

    public static class A implements Runnable{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            printNums(10);
        }

        public void printNums(int n) {
            for (int i = 0; i <= n; i++) {
                System.out.println(i);
            }
        }
    }
    public static class B implements Runnable{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            printLetters(10);
        }
        public void printLetters(int n) {
            Character[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'k','l','m', 'n'};
            for (int i = 0; i <= n; i++) {
                System.out.println(letters[i]);
            }
        }
    }

    public static class PowerCalculatingThread implements Runnable{
        private BigInteger result = BigInteger.ONE;
        private BigInteger base;
        private BigInteger power;

        public PowerCalculatingThread(BigInteger base, BigInteger power) {
            this.base = base;
            this.power = power;
        }

        @Override
        public void run() {
           /*
           Implement the calculation of result = base ^ power
           */
            this.result = getPower(base, power);
        }

        public BigInteger getPower(BigInteger base, BigInteger power) {
            BigInteger res = BigInteger.ONE;
            for (BigInteger i = BigInteger.ZERO; i.compareTo(base) != 0; i = i.add(BigInteger.ONE)) {
                res = res.multiply(base);
            }
            return res;
        }

        public BigInteger getResult() { return result; }
    }

}
