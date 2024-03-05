package Semaphore;

import java.util.concurrent.Semaphore;

public class CountingSemaphore {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3,true);
        System.out.println("Total available Semaphore permits is: " + semaphore.availablePermits());

        DemoThread t1 = new DemoThread("A", semaphore);
        t1.start();
        DemoThread t2 = new DemoThread("B", semaphore);
        t2.start();
        DemoThread t3 = new DemoThread("C", semaphore);
        t3.start();
        DemoThread t4 = new DemoThread("D", semaphore);
        t4.start();

    }
}

class DemoThread extends Thread {
    String name = "";
    Semaphore semaphore;

    //constructor of the DemoThread class
    DemoThread(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
    }

    public synchronized void run() {
        try {
            System.out.println("Thread " + name + " : acquiring lock...");
            System.out.println("Thread " + name + " : available Semaphore permits is: " + semaphore.availablePermits());
            semaphore.acquire();
            System.out.println("Thread " + name + " : got the permit!");
            try {
                System.out.println("Thread " + name + " : is performing operation ");
                for (int i = 1; i <= 5; i++) {
//                     + i + ", available Semaphore permits : " + Counting.semaphore.availablePermits());
                    Thread.sleep(2000);
                }
            } finally {
                System.out.println("Thread " + name + " : releasing lock...");
                semaphore.release();
                System.out.println("Thread " + name + " : available Semaphore permits is: " + semaphore.availablePermits());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
