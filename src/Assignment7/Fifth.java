package Assignment7;

public class Fifth{
    public static void main(String[] args) throws InterruptedException {
        Thread th1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running thread 1");
            }
        });

        Thread th2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    System.out.println("Thread 2 continues");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        th1.start();
        th2.start();
        System.out.println(Thread.currentThread().getName()+" Ended");
    }
}