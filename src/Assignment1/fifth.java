package Assignment1;

import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class fifth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values :- ");
        String inputs = sc.nextLine();

        int index ;

        if (inputs.indexOf('+') != -1){
            index = inputs.indexOf('+');
            double first = parseDouble(inputs.substring(0,index));
            double second = parseDouble(inputs.substring(index+1));
            System.out.println(first+second);
        }else if (inputs.indexOf('-') != -1){
            index = inputs.indexOf('-');
            double first = parseDouble(inputs.substring(0,index));
            double second = parseDouble(inputs.substring(index+1));
            System.out.println(first-second);
        } else if (inputs.indexOf('*') != -1) {
            index = inputs.indexOf('*');
            double first = parseDouble(inputs.substring(0,index));
            double second = parseDouble(inputs.substring(index+1));
            System.out.println(first*second);
        } else {
            index = inputs.indexOf('/');
            double first = parseDouble(inputs.substring(0,index));
            double second = parseDouble(inputs.substring(index+1));
            System.out.println(first/second);
        }

    }
}