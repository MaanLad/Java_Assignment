package Assignment9;


import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

interface Task{
    void execute();
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
                task.execute();
                synchronized (results){
                    results.add(Thread.currentThread().getName() +": Task Completed");
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
        Master master = new Master(2);

        Task t1 = () -> System.out.println("Task 1 doing and returning result");
        Task t2 = () -> System.out.println("Task 2 doing and returning result");
        Task t3 = () -> System.out.println("Task 3 doing and returning result");
        Task t4 = () -> System.out.println("Task 4 doing and returning result");
        Task t5 = () -> System.out.println("Task 5 doing and returning result");
        Task t6 = () -> System.out.println("Task 6 doing and returning result");

        master.submitWork(t1);
        master.submitWork(t2);
        master.submitWork(t3);
        master.submitWork(t4);
        master.submitWork(t5);
        master.submitWork(t6);

        Thread.sleep(500);

        System.out.println("Printing Result");
        for (String str : master.getResults()) {
            System.out.println(str);
        }
    }
}
