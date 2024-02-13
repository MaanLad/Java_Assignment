package src2;

import java.util.Scanner;


public class armstrong {

    public static void checkArmstrong(String num) {
        int n = num.length();
        int pNum = Integer.parseInt(num);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (pNum % 10 != 0) {
                sum += (int) Math.pow((pNum % 10), n);
                pNum /= 10;
            }
        }
        if(Integer.parseInt(num)==sum){
            System.out.println("The number "+num+ " is Armstrong number");
        }else {
            System.out.println("The number "+num+" is not Armstrong number");
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any number to check :- ");
        String num=sc.nextLine();
        checkArmstrong(num);
        }
    }

