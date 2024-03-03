package Practice;

import javax.swing.plaf.TableHeaderUI;

interface ExampleRunnable {
    void getData();
}

public class PracticeThread {
    public static void main(String[] args) {
        Runnable r=()-> System.out.println("hello ");
        Thread th1=new Thread(r);
        th1.start();

        ExampleRunnable ex1=()-> System.out.println("sout from lambda");
        ex1.getData();


        Thread th2=new Thread(()->{
            System.out.println("multiple ");
            System.out.println("statement ");
            System.out.println("from ");
            System.out.println("lambada ");
        });
        th2.start();
    }
}
