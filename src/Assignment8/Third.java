package Assignment8;

interface SquareRoot {
    void anonymousSqrRoot(double input);
}
public class Third {
    public static void main(String[] args) {
        double input=81;
        SquareRoot sr= n-> System.out.println("The square root of num "+n+" is "+Math.sqrt(input));
        sr.anonymousSqrRoot(input);
    }
}
