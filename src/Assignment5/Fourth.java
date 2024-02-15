package Assignment5;

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the salary :- ");
        double value=sc.nextInt();
        double incomeTax;
        if(value>150000){
            incomeTax=(value*30)/100;
        }
        else if(value>60000){
            incomeTax=(value*20)/100;
        }
        else if(value>50000){
            incomeTax=(value*10)/100;
        }
        else{
            incomeTax=0;
        }
        System.out.println("Income is:- "+incomeTax);
    }
}
