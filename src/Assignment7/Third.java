package Assignment7;

public class Third implements Runnable{
    String name;
    Thread th;
    @Override
    public void run() {
        try{
            for (int i = 0; i < 3; i++) {
                System.out.println(name+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    Third(String input){
        name=input;
        th=new Thread(this,name);
        System.out.println("Thread with name "+name+" created");
        th.start();
    }
    public static void main(String[] args) {
        Third mThread1=new Third("maan");
        Third mThread2=new Third("jhon");
        System.out.println("Main method eneded");
    }

}
