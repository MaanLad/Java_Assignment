package Assignment9;

class Table{
    public void printTable(int n ){
        for (int i = 1; i < 6; i++) {
            System.out.println(i*n);
        }
    }
}

class SampleSync extends Thread{

    int n;
    Table t;
    SampleSync(int n,Table t ){
        this.n=n;
        this.t=t;
    }


    @Override
    public void run() {
        synchronized (t){
            t.printTable(n);
        }
        super.run();
    }
}
public class SampleProgram {
    public static void main(String[] args) {
        Table t=new Table();
        Thread t1=new SampleSync(2,t);
        Thread t2=new SampleSync(3,t);
        t1.start();
        t2.start();
    }
}
