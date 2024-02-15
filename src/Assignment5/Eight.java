package Assignment5;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Eight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Username :- ");
        while(true){
            String uName =sc.next();
            String regEx="^[a-zA-Z][a-zA-Z0-9_]{8,30}$";
            if(Pattern.matches(regEx,uName)){
                System.out.println("The Username is valid");
                break;
            }
            else{
                System.out.println("Enter valid Username");
            }
        }
    }
}
