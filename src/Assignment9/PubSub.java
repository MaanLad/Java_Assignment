package Assignment9;


import jdk.dynalink.beans.StaticClass;

import java.util.ArrayList;
import java.util.HashMap;

class Subscriber{
    String subName;
    MessageQueue messageQueue;

    ArrayList<String> subscriberList;
Subscriber(String subName,MessageQueue messageQueue,ArrayList<String> sublist){
    this.messageQueue=messageQueue;
    this.subName=subName;
    this.subscriberList=sublist;
}
void getMessage(){
    subscriberList.forEach(element-> messageQueue.getMessage(element).forEach(value->System.out.println(subName+" get :- "+value)));
}
}

class Publiser{
    String pubName;
    MessageQueue msgQueue;
    Publiser(String pubName,MessageQueue msgQueue){
        this.pubName=pubName;
        this.msgQueue=msgQueue;
    }

    public void publishMessage(String message){
    msgQueue.publishMsgInMsgQ(this,message);
    }
}

class MessageQueue{
    HashMap<String, ArrayList<String>> hm=new HashMap<>();
    public void publishMsgInMsgQ(Publiser p,String message){
        if(hm.containsKey(p.pubName)){
            hm.get(p.pubName).add(message);
        }else{
            ArrayList<String> l = new ArrayList<>();
            l.add(message);
            hm.put(p.pubName,l);
        }
    }
    public ArrayList<String> getMessage(String pubName){
        return hm.get(pubName);
    }
}
public class PubSub {
    public static void main(String[] args) {
    MessageQueue msgQueue=new MessageQueue();

    Publiser publiser1=new Publiser("Publisher1",msgQueue);
    Publiser publiser2=new Publiser("Publisher2",msgQueue);
    Publiser publiser3=new Publiser("Publisher3",msgQueue);

    ArrayList<String> subList1=new ArrayList<>();
    subList1.add(publiser1.pubName);
    subList1.add(publiser2.pubName);


    Subscriber sub1=new Subscriber("Subscriber1",msgQueue,subList1);

        ArrayList<String> subList2=new ArrayList<>();
        subList2.add(publiser1.pubName);
        subList2.add(publiser3.pubName);
    Subscriber sub2=new Subscriber("Subscriber2",msgQueue,subList2);

    publiser1.publishMessage("Hello this is publisher 1 ");
    publiser2.publishMessage("Hello this is publisher 2 ");
    publiser2.publishMessage("Hello second time from publisher 2 ");
    publiser3.publishMessage("Hello this is publisher 3 ");



    sub1.getMessage();
    sub2.getMessage();
    }
}
