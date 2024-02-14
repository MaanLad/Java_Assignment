package Assignment2;

import java.util.Scanner;

public class Pattern2 {

    public static void printPattern(char chr) {
        char c = 'A';
        int row=chr-66;
        for (int i = 0; i <= row; i++) {
            System.out.print(" ");
        }
        System.out.println(Character.toString(c));

        for (int i = 0; i < row; i++) {

            for (int k = 0; k < row - i; k++) {
                System.out.print(" ");
            }

            System.out.print(Character.toString(c + i + 1) + " ");
            for (int x = 0; x < i; x++) {
                System.out.print("  ");
            }
            System.out.print(Character.toString(c + i + 1));
            System.out.println(" ");
        }
        for (int i = row; i >= 0; i--) {

            for (int k = 0; k < row - i; k++) {
                System.out.print(" ");
            }

            System.out.print(Character.toString(c + i + 1) + " ");
            for (int x = 0; x < i; x++) {
                System.out.print("  ");
            }
            System.out.print(Character.toString(c + i + 1));
            System.out.println(" ");
        }

        for (int i = 0; i <= row; i++) {
            System.out.print(" ");
        }
        System.out.println(Character.toString(c));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of row :- ");
        char c =sc.next().charAt(0);
        printPattern(c);
    }
}

