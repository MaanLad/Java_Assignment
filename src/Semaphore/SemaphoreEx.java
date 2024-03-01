package Semaphore;

import java.util.concurrent.*;
import java.util.function.Supplier;
import java.util.stream.IntStream;


public class SemaphoreEx {
        static  int  count=0;
    public static void main(String[] args) {
        Semaphore semaphore=new Semaphore(3);
        ExecutorService executorService= Executors.newFixedThreadPool(10);

        IntStream.rangeClosed(1,10).forEach(n->executorService.submit(()->{
            boolean permit=false;
            try {
//                System.out.println(semaphore.isFair());
//                System.out.println("Permit status semaphore :- "+semaphore.availablePermits());
                permit=semaphore.tryAcquire(6, TimeUnit.SECONDS);
                if(permit){
                    System.out.println("Permit acquired");
                    Thread.sleep(5000);
                }else{
                    System.out.println("Permit deny");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally {
                if(permit) semaphore.release();
            }
        }));

        executorService.shutdown();
        while(!executorService.isTerminated()){}
        System.out.println(count);

//        try {
//            semaphore.acquire();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        semaphore.release();
    }
}
