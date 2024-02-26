package Assignment9;

class CustomerC{
    String name;
    CustomerC(String name){
        this.name=name;
    }
    int balance;
     synchronized void withDrawAmount(int amount){
         System.out.println("Going to withdraw amount :- "+amount);
         while(amount>this.balance){
             System.out.println("Balance is less than withdraw amount");
            try{
                System.out.println("Customer: " + this.name + " Less balance; waiting for deposit balance : " + this.balance);
                wait();
            }catch(Exception e){
                System.out.println(e.toString());
            }
            this.balance=this.balance-amount;
             System.out.println("Customer: " + this.name + " withdraw completed balance : " + this.balance);
         }
     }

     synchronized void depositAmount(int amount){
         System.out.println("Customer: " + this.name + " going to deposit amount..." + amount + " balance:" + this.balance);
         this.balance+= amount;
         System.out.println("Customer: " + this.name + " deposit completed" + " balance:" + this.balance);
         notifyAll();
     }
}

public class AnotherSampler {
    public static void main(String[] args) {
        CustomerC c=new CustomerC("Maan");
        new Thread(()->c.withDrawAmount(10000)).start();
//        new Thread(()->c.withDrawAmount(10000)).start();
        new Thread(()->c.depositAmount(20000)).start();
        new Thread(()->c.depositAmount(10000)).start();
    }
}
