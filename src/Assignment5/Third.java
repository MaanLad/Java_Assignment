package Assignment5;

import java.util.Arrays;
import java.util.Scanner;

class InvalidInputToArrayException extends Exception{
    public InvalidInputToArrayException(String str){
        super(str);
    }
}


public class Third {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[5];
        try {
        for (int i = 0; i <arr.length; i++) {
            System.out.print("Enter element at postion["+i+"] :- ");
            int temp=sc.nextInt();
            if(temp<0) throw new InvalidInputToArrayException("Enter valid input to array");
            arr[i]=temp;
            System.out.println();
        }
        }catch (InvalidInputToArrayException e){
        System.out.println(e.getMessage());
        }
        System.out.println(Arrays.toString(arr));
    }
}
