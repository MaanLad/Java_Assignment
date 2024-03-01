package TextAndZip;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class Message {
    private String content;

    public Message(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

class MessageQueue {
    private BlockingQueue<Message> queue = new LinkedBlockingQueue<>();

    public synchronized void publish(Message message) {
        try {
            queue.put(message);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Error publishing message: " + e.getMessage());
        }
    }

    public Message subscribe() {
        try {
            return queue.take();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Error subscribing to message: " + e.getMessage());
            return null;
        }
    }
}

class Publisher {
    private String name;
    private MessageQueue messageQueue;

    public Publisher(String name, MessageQueue messageQueue) {
        this.name = name;
        this.messageQueue = messageQueue;
    }

    public synchronized void publishMessage(String content) {
        Message message = new Message(content);
        System.out.println("Publisher " + name + " publishing message: " + content);
        messageQueue.publish(message);
    }
}

class Subscriber {
    private String name;
    private MessageQueue messageQueue;
    static Message message;

    public Subscriber(String name, MessageQueue messageQueue) {
        this.name = name;
        this.messageQueue = messageQueue;
    }

    public void subscribeToMessages() {
            message=messageQueue.subscribe();
        while (true) {
            System.out.println("Subscriber " + name + " received message: " + message.getContent());
            // Process the message as needed
        }
    }
}

public class PubSubMessagingSystem {
    public static void main(String[] args) {
        MessageQueue messageQueue1 = new MessageQueue();
//        MessageQueue messageQueue2=new MessageQueue();

        Publisher publisher1 = new Publisher("Publisher1", messageQueue1);
//        Publisher publisher2 = new Publisher("Publisher2", messageQueue2);

        Subscriber subscriber1 = new Subscriber("Subscriber1", messageQueue1);
        Subscriber subscriber2 = new Subscriber("Subscriber2", messageQueue1);

        // Simulate message subscribing
        new Thread(subscriber1::subscribeToMessages).start();
        new Thread(subscriber2::subscribeToMessages).start();

        // Simulate message publishing
        new Thread(() -> publisher1.publishMessage("Hello from Publisher1")).start();
        new Thread(() -> publisher1.publishMessage("Hello from Publisher1 second time")).start();
//        new Thread(() -> publisher2.publishMessage("Greetings from Publisher2")).start();
//        new Thread(()->publisher2.publishMessage("Second message from publisher2 ")).start();
    }
}
