package Practice;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

class Publisher{
    MessageQueue msgQueue;
    public Publisher(MessageQueue msgQueue) {
        this.msgQueue = msgQueue;
    }
    public void publishMsg(String msg){
        msgQueue.publish(msg);
    }
}
class Subsciber{
    String name;
    private MessageQueue messageQueue;
    public Subsciber(String subName,MessageQueue messageQueueNew) {
        this.messageQueue = messageQueueNew;
        this.name=subName;
    }

    public void subMessage(){
        while(true){
            String msg=messageQueue.subscribe();
            System.out.println("Subscriber :- "+name+" Message :- "+msg);
        }
    }
}

class MessageQueue{
    Queue<String> msgQueue=new ConcurrentLinkedQueue<>();
    void publish(String msg){
        msgQueue.add(msg);
    }

    public synchronized String subscribe(){
        if(msgQueue.isEmpty()){
            try{
                wait();
            }catch (InterruptedException e ){
                System.out.println(e.toString());
            }
        }
        return msgQueue.poll();
    }

}
public class PubSub {
    public static void main(String[] args) {
        MessageQueue messageQueue=new MessageQueue();

        Publisher p1=new Publisher(messageQueue);
        Publisher p2=new Publisher(messageQueue);

        Subsciber s1=new Subsciber("Subscriber1 ",messageQueue);
        Subsciber s2=new Subsciber("Subscriber2",messageQueue);

        p1.publishMsg("Hello first time ");
        p1.publishMsg("Hello second time ");
        p1.publishMsg("Hello third time ");
        new Thread(s1::subMessage).start();
        new Thread(s2::subMessage).start();
        p1.publishMsg("Hello fourth time ");
//        new Thread(s1::subMessage).start();
//        new Thread(s1::subMessage).start();
    }
}
