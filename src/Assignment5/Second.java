package Assignment5;


abstract class Employee {

    abstract double getNetSalary();

    abstract void display();
}

class Manager extends Employee {

    String employeeId;
    String name;
    double salary;

    Manager(){}

    Manager(String employeeId,String name, double salary) {
        this.employeeId=employeeId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    double getNetSalary() {
        return this.salary * 12;
    }

    @Override
    void display() {
        if(this.employeeId==null){
            System.out.println("Enter required details of new manager!!");
        }else{
        System.out.println("Employee Id :- "+this.employeeId);
        System.out.println("Manager name :- " + this.name);
        System.out.println("Manager salary :- " + this.salary);
        System.out.println("Manager netSalary :- "+this.getNetSalary());
    }
        }
}

class Clerk extends Employee {

    String clerkId;
    String name;
    double salary;

    Clerk(){}

    public Clerk(String clerkId,String name, int salary) {
        this.clerkId=clerkId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    double getNetSalary() {
        return this.salary * 12;
    }

    @Override
    void display() {

        if(this.clerkId==null){
            System.out.println("Enter required details of new clerk!!");
        }else{
        System.out.println("Clerk id :- " + this.clerkId);
        System.out.println("Clerk name :- " + this.name);
        System.out.println("Clerk salary :- " + this.salary);
        System.out.println("Clerk netSalary :- " + this.getNetSalary());
        }
    }
}


public class Second {
    public static void main(String[] args) {

        //Manager class object
        Manager m = new Manager("MNG123","Maan", 300000);
        m.display();

        System.out.println();


        //Clerk class object
        Clerk c=new Clerk("CL123","John",20000);
        c.display();

        System.out.println();
        //Clerk object with not details
        Clerk c1=new Clerk();
        c1.display();
    }
}
