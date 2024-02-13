package src2;

import java.util.Scanner;

public class BMI {
    public static void getBMIMsg(float height,float weight) {
        double h = height * 0.0254;
        double w = weight * 0.454;
        double bmi = w / (Math.pow(h, 2));
        if (bmi <= 16) {
            System.out.println("Starvation");
        } else if (bmi > 16 && bmi <= 16.99) {
            System.out.println("Emaciation");
        } else if (bmi > 17 && bmi <= 18.49) {
            System.out.println("Underweight");
        } else if (bmi > 18.50 && bmi <= 22.99) {
            System.out.println("Normal,Low Range");
        } else if (bmi > 23 && bmi <= 24.99) {
            System.out.println("Normal,High Range");
        } else if (bmi > 25 && bmi <= 27.49) {
            System.out.println("Overweight,Low Range");
        } else if (bmi > 27.50 && bmi <= 29.99) {
            System.out.println("Overweight,High Range");
        } else if (bmi > 30 && bmi <= 34.99) {
            System.out.println("1st degree obesity");
        } else if (bmi > 25 && bmi <= 39.99) {
            System.out.println("2nd degree obesity");
        } else {
            System.out.println("Enter valid inputs");
        }
    }

    public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.print("Enter your height in inches :- ");
            float height= sc.nextFloat();
            System.out.print("Enter your weight in pounds :- ");
            float weight=sc.nextFloat();
            getBMIMsg(height,weight);
    }
}
