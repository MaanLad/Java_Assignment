package Assignment7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Fourth{
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        Runnable r=()-> System.out.println("hello ");
        Thread th1=new Thread(r);
        th1.start();
        for (int i = 0; i < 10; i++) {
            Runnable worker=new WorkerThread(""+i);
            executorService.execute(worker);
        }
        executorService.shutdown();
        while(!executorService.isTerminated()){}
        System.out.println("All threads are terminated");
    }
}

class WorkerThread implements Runnable{
    String message;
    WorkerThread(String message){
        this.message =message;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" thread started worker:"+this.message);
        threadTask();
        System.out.println(Thread.currentThread().getName()+" thread ended");
    }

    private void threadTask(){
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}