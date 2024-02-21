package Others;

//import java.nio.channels.GatheringByteChannel;

public class RunnableInterface implements Runnable{
    @Override
    public void run() {
        System.out.println("Run by implementing runnable interface");
    }

    public static void main(String[] args) {

//    Runnable rni=new Runnable() {
//        @Override
//        public void run() {
//            System.out.println("This is implementation of runnable interface");
//        }
//    };
        RunnableInterface rni=new RunnableInterface();

        rni.run();

//        Thread th=new Thread(rni);
//        th.start();
//        th.run();
//        System.out.println(th.run());
    }
}
