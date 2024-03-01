package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
class Publishere_new{
    MessageQueue_new msgQueue;
    public Publishere_new(MessageQueue_new msgQueue) {
        this.msgQueue = msgQueue;
    }
    public void publishe_msg(String msg){
        msgQueue.publish(msg);
    }
}
class Subscriber_new{
    private MessageQueue_new messageQueueNew;
    public Subscriber_new(MessageQueue_new messageQueueNew) {
        this.messageQueueNew = messageQueueNew;
    }
    public void subMessageNEW(){
        messageQueueNew.subscriber_new();
    }
}
class MessageQueue_new{
    Queue<String> msgQueue =new ConcurrentLinkedQueue<>();
    public synchronized void publish(String msg){
        msgQueue.offer(msg);
        notifyAll();
    }
    public synchronized void subscriber_new(){
        while (msgQueue.isEmpty()){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class pub_subNew {
    public static void main(String[] args) {
        MessageQueue_new msgQueue = new MessageQueue_new();
        Publishere_new publishere_new = new Publishere_new(msgQueue);

        List<Thread> newSubThreads = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Subscriber_new subscriber_new = new Subscriber_new(msgQueue);
            Thread threadSub = new Thread(subscriber_new::subMessageNEW, "Subscriber"+(i+1));
            newSubThreads.add(threadSub);
            threadSub.start();
        }
        publishere_new.publishe_msg("hello 1st");
        publishere_new.publishe_msg("hello 2nd");
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        for (Thread th : newSubThreads){
//            th.interrupt();
//        }
    }
}
