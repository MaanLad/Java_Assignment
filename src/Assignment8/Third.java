package Assignment8;

interface SqureRoot{
    void anoynomusSqrRoot(double input);
}
public class Third {
    public static void main(String[] args) {
        double input=81;
        SqureRoot sr=n-> System.out.println("The square root of num "+n+" is "+Math.sqrt(input));
        sr.anoynomusSqrRoot(input);
    }
}
