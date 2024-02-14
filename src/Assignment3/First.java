package Assignment3;

import java.util.Scanner;

public class First {
    public static boolean isOdd(int num){
        return num%2==1;
    }
    public static boolean isPrime(int num){
            if(num <= 1) return false;
            for (int i = 2; i < num/2; i++) {
                if(num%i == 0 ) return false;
            }
            return true;
    }
    public static boolean isPalindrome(int num){
        int reversed= 0;
        int rem = 0 ;
        int orginal = num;

        while (num > 0){
            rem = num % 10;
            reversed = (reversed * 10) + rem;
            num /= 10;
        }
        return orginal == reversed;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of operation :- ");
        int numOp=sc.nextInt();
        String[] results=new String[numOp];
        System.out.println("OPERATION TYPES:");
        System.out.println("1.Check if the number is odd or not.");
        System.out.println("2.Check if the number is pime or not.");
        System.out.println("3.Check if the number is palindrome or not.");
        for (int i = 0; i < numOp; i++) {
            System.out.print("\nChoose Operation type :");
            int choice=sc.nextInt();
            System.out.print("Enter the number : ");
            int value=sc.nextInt();
            switch (choice){
                case 1:
                    results[i]=isOdd(value)?"Odd":"Even";
                    break;
                case 2:
                    results[i]=isPrime(value)?"Prime":"NotPrime";
                    break;
                    case 3:
                        results[i]=isPalindrome(value)?"Palindrome":"NotPalindrome";
                    break;
            }
        }
        System.out.println("");
        for (String result : results) {
            System.out.println(result);
        }
    }
}
