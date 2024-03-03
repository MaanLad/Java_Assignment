package Assignment7;

public class Second extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println("Run by overriding thread class");
    }

    public static void main(String[] args) {
        Thread th1=new Second();
        th1.start();

        Thread th2=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        });
    }
}
