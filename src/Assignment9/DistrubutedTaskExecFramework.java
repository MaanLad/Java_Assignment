package Assignment9;


import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

interface Task{
    String execute();
}
class Worker implements Runnable{
    private final Queue<Task> TaskQ;
    private final List<String> results;

    public Worker(Queue<Task> taskQ, List<String> results) {
        this.TaskQ = taskQ;
        this.results = results;
    }

    @Override
    public void run() {
        while (true){
            Task task;
            synchronized (TaskQ){
                while (TaskQ.isEmpty()){
                    try {
                        TaskQ.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                task = TaskQ.poll();
            }
            if (task != null){
                String taskResult =task.execute();
                synchronized (results){
                    results.add(Thread.currentThread().getName() +": "+taskResult+" Completed");
                }
            }
        }
    }
}

class Master{
    private final Queue<Task> taskQ;
    private final List<String> results;
    private final List<Worker> workers;

    Master(int maxWorker){
        taskQ = new LinkedBlockingQueue<>();
        results = new ArrayList<>();
        workers = new ArrayList<>();
        for (int i = 0; i < maxWorker; i++) {
            Worker worker = new Worker(taskQ,results);
            workers.add(worker);
            new Thread(worker,"Worker-"+i).start();
        }
    }
    public void submitWork(Task task){
        synchronized (taskQ){
            taskQ.add(task);
            taskQ.notifyAll();
        }
    }
    public List<String> getResults(){
        return results;
    }
}

public class DistrubutedTaskExecFramework  {
    public static void main(String[] args) throws InterruptedException {
        Master master = new Master(4);


        Task t1 = () -> {System.out.println("Task 1 done and returning result");return "Task1";};
        Task t2 = () -> {System.out.println("Task 2 done and returning result");return "Task2";};
        Task t3 = () -> {System.out.println("Task 3 done and returning result");return "Task3";};
        Task t4 = () -> {System.out.println("Task 4 done and returning result");return "Task4";};
        Task t5 = () -> {System.out.println("Task 5 done and returning result");return "Task5";};
        Task t6 = () -> {System.out.println("Task 6 done and returning result");return "Task6";};
//        Task t2 = () -> System.out.println("Task 2 done and returning result");
//        Task t3 = () -> System.out.println("Task 3 done and returning result");
//        Task t4 = () -> System.out.println("Task 4 done and returning result");
//        Task t5 = () -> System.out.println("Task 5 done and returning result");
//        Task t6 = () -> System.out.println("Task 6 done and returning result");

        new Thread(()->master.submitWork(t1)).start();
        new Thread(()->master.submitWork(t2)).start();
        new Thread(()->master.submitWork(t3)).start();
        new Thread(()->master.submitWork(t4)).start();
        new Thread(()->master.submitWork(t5)).start();
        new Thread(()->master.submitWork(t6)).start();
//        master.submitWork(t1);
//        master.submitWork(t2);
//        master.submitWork(t3);
//        master.submitWork(t4);
//        master.submitWork(t5);
//        master.submitWork(t6);

        Thread.sleep(500);

        System.out.println("Printing Result");
        for (String str : master.getResults()) {
            System.out.println(str);
        }
    }
}
