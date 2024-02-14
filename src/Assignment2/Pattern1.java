package Assignment2;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of row :- ");
        int row=sc.nextInt();


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }


        for (int i = row-1; i >=0; i--) {
            for (int j = 0; j < row - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }


    }
}
