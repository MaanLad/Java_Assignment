package Assignment5;

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the salary :- ");
        double value=sc.nextInt();
        double incomeTax;
        if(value>150000){
            incomeTax=((value-150000)*0.3)+(0.2*90000)+(0.1*10000);
        }
        else if(value>60000){
            incomeTax=((value-60000)*0.2)+(0.1*10000);
        }
        else if(value>50000){
            incomeTax=(value-50000)*0.1;
        }
        else{
            incomeTax=0;
        }
        System.out.println("IncomeTax is:- "+incomeTax);
    }
}
