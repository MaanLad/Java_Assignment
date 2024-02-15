package Assignment5;

public class Seventh {
    public static void main(String[] args) {
        String name="maan";
        System.out.println("Input :- "+name);
        String ans = name.split("\\b\\w")[1];
        System.out.print("Pig latin translated :- ");
        System.out.println(ans+name.charAt(0)+"ay");
        }
    }
