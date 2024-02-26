package Assignment9;

class Customer {
    int amount = 10000;
    String name;

    Customer(String name) {
        this.name = name;
    }

    synchronized void withdraw(int amount) {
        System.out.println("Customer: " + this.name + " going to withdraw amount..." + amount);
        while (this.amount < amount) {
            System.out.println("Customer: " + this.name + " Less balance; waiting for deposit balance : " + this.amount);
            try {
                wait();
            } catch (Exception e) {
            }
        }
        this.amount -= amount;
        System.out.println("Customer: " + this.name + " withdraw completed balance : " + this.amount);
    }

    synchronized void deposit(int amount) {
        System.out.println("Customer: " + this.name + " going to deposit amount..." + amount + " balance:" + this.amount);
        this.amount += amount;
        System.out.println("Customer: " + this.name + " deposit completed" + " balance:" + this.amount);
        notifyAll();
    }
}

public class Bank {
    public static void main(String args[]) {
        final Customer c = new Customer("Sumit");
        new Thread() {
            public void run() {
                c.withdraw(15000);
            }
        }.start();
        new Thread() {
            public void run() {
                c.withdraw(10000);
            }
        }.start();
        new Thread() {
            public void run() {
                c.deposit(10000);
            }
        }.start();
        new Thread() {
            public void run() {
                c.deposit(10000);
            }
        }.start();
    }
}
