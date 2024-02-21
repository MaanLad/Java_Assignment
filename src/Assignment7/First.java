package Assignment7;

public class First implements Runnable{
    @Override
    public void run() {
        System.out.println("Run by implementing runnable interface run method");
    }
    public static void main(String[] args) {
            Runnable r1=new First();
            Thread th1=new Thread(r1);
            th1.start();
    }
}
