package Others;


class Table{
    public void printTable(int n){
        for (int i = 1; i <= 5; i++) {
            System.out.println(i*n);
        }
    }
}
class CustomeThread extends Thread{

    int n;
    final Table t;

    CustomeThread(Table t,int n ){
        this.t=t;
        this.n=n;
    }

    @Override
    public void run() {
        synchronized (t){
            t.printTable(n);
        }
        super.run();
    }
}

public class Main {
    public static void main(String[] args) {
        CustomeThread c1=new CustomeThread(new Table(),3);
        CustomeThread c2=new CustomeThread(new Table(),2);

        c1.start();
        c2.start();


        try{
        c1.join();
        c2.join();
        }catch (Exception e){
            System.out.println(e.toString());
        }

    }
}