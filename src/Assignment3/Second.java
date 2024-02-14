package Assignment3;

import java.util.Scanner;

public class Second {
    public static int getFrequency(String s,long num){
        int count=0;
        for (int i = 0; i < num; i++) {
            if(s.charAt(i%s.length())=='a')count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input string :- ");
        String a =sc.next();
        System.out.print("Number of times string repeat :- ");
        long n=sc.nextLong();
        System.out.println();
        System.out.println("The frequency of a in substring :- "+getFrequency(a,n));
    }
}
