package Assignment5;

import java.util.HashMap;
import java.util.Map;

class Bank {
    private static final Map<String, Bank> bankInstances=new HashMap<>();
    String accNo;
    int balance = 0;

    Bank(String accNo) {
        this.accNo = accNo;
        bankInstances.put(accNo,this);
    }

    Bank(String accNo, int balance) {
        this.accNo = accNo;
        this.balance = balance;
        bankInstances.put(accNo,this);
    }

    public static Bank getInstance(String accNo) {
        if (bankInstances.containsKey(accNo)) {
            // Return existing instance if accNo already exists
            return bankInstances.get(accNo);
        } else {
            // Create a new instance if accNo doesn't exist
            Bank newBankInstance = new Bank(accNo);
            bankInstances.put(accNo, newBankInstance);
            return newBankInstance;
        }
    }

    public int getBalance() {
        return balance;
    }

    public int depositAmount(int amount) {
        this.balance = balance + amount;
        return this.getBalance();
    }

    public int withdrawAmount(int amount) {
        if(amount>this.balance){
            System.out.println("Not enough balance to withdraw");
            return this.balance;
        }else{
            this.balance = balance - amount;
            return this.getBalance();
        }

    }

}

public class First {
    public static void main(String[] args) {
        Bank b = new Bank("123456", 40000);
        System.out.println("Current balance (Retrieving balance) of accNo "+b.accNo+" :- " + b.getBalance());
        System.out.println("Withdraw certain amount (Retrieving amount after withdraw) from accNo "+b.accNo+" :- " + b.withdrawAmount(10000));
        System.out.println("Deposit certain amount (Retrieving amount after deposit) to accNo "+b.accNo+" :- " + b.depositAmount(15000));
        System.out.println();
        System.out.println("Instances by the getInstance method");
        Bank b1=Bank.getInstance("1234567");
        Bank b2=Bank.getInstance("123456");
        System.out.println("Current balance (Retrieving balance) of accNo "+b1.accNo+" :- " + b1.getBalance());
        System.out.println("Current balance (Retrieving balance) of accNo " + b2.accNo + " :- " + b2.getBalance());
    }
}
