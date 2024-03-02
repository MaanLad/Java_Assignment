package Practice;

class BoundedSemaphoreEx {
    int signal;
    int capacity;

    public BoundedSemaphoreEx(int cap) {
        signal = 0;
        capacity = cap;
    }

    /*
     * Notice how the acquire() method now blocks if the number of signals is equal to the upper bound.
     *
     * Not until a thread has called release() will the thread calling take() be allowed to deliver its signal,
     * if the BoundedSemaphore has reached its upper signal limit.
     *
     * If the queue size is not equal to either bound when enqueue() or dequeue() is called,
     * there can be no threads waiting to either enqueue or dequeue items.
     * */
    public synchronized void acquire() throws InterruptedException {
        while (signal == capacity) {
            wait();
        }

        if (signal == 0) {
            notifyAll();
        }

        signal++;
    }

    public synchronized void release() throws InterruptedException {
        if (signal == 0) {
//            wait();
            throw new InterruptedException("You can not release lock before acquiring it");
        }

        if (signal == capacity) {
            notifyAll();
        }

        signal--;
    }
}

public class BoundedSemaphore {

    public static void main(String[] args) {
        BoundedSemaphoreEx boundedSemaphoreEx = new BoundedSemaphoreEx(2);

        BoundThread boundThread1 = new BoundThread("A", boundedSemaphoreEx);
        BoundThread boundThread2 = new BoundThread("B", boundedSemaphoreEx);
        BoundThread boundThread3 = new BoundThread("C", boundedSemaphoreEx);
        boundThread1.start();
        boundThread2.start();
        boundThread3.start();
    }

}

class BoundThread extends Thread {
    String name = "";
    BoundedSemaphoreEx boundedSemaphoreEx;

    //constructor of the DemoThread class
    BoundThread(String name, BoundedSemaphoreEx boundedSemaphoreEx) {
        this.name = name;
        this.boundedSemaphoreEx = boundedSemaphoreEx;
    }

    public void run() {
        try {
            System.out.println("Thread " + name + " : acquiring lock...");
            System.out.println("Thread " + name + " : available Semaphore permits is: " + (boundedSemaphoreEx.capacity - boundedSemaphoreEx.signal));
//            boundedSemaphoreEx.release();
            boundedSemaphoreEx.acquire();
            System.out.println("Thread " + name + " : got the permit!");
            try {
                System.out.println("Thread " + name + " : is performing operation ");
                for (int i = 1; i <= 5; i++) {
//                     + i + ", available Semaphore permits : " + Counting.semaphore.availablePermits());
                    Thread.sleep(200);
                }
            } finally {
                System.out.println("Thread " + name + " : releasing lock...");
                boundedSemaphoreEx.release();
                System.out.println("Thread " + name + " : available Semaphore permits is: " + (boundedSemaphoreEx.capacity - boundedSemaphoreEx.signal));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}