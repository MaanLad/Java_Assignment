package Assignment7;


public class Third implements Runnable{
    @Override
    public void run() {
        try{
            System.out.println("Thread "+Thread.currentThread().getName()+" started");
            for (int i = 0; i < 3; i++) {
                Thread.sleep(1000);
                System.out.println("Thread " +Thread.currentThread().getName()+" is running "+i);
            }
            System.out.println("Thread "+Thread.currentThread().getName()+" ended");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        //Multiple threads of main thread
        Thread th1=new Thread(new Third());
        Thread th2=new Thread(new Third());
        th1.start();
        th2.start();
        System.out.println("Main method ended");
    }

}
