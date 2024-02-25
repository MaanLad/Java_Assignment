package Assignment5;
import java.util.Scanner;


public class Fifth {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Input: ");
            int n = sc.nextInt();
            System.out.println("Output: ");
                switch(n)
                {
                    case 0:
                        System.out.println(" __ \n|  | \n|__|");
                        break;
                    case 1:
                        System.out.println("   \n  |\n  |");
                        break;
                    case 2:
                        System.out.println(" __ \n __|\n|__ ");
                        break;
                    case 3:
                        System.out.println(" __ \n __|\n __|");
                        break;
                    case 4:
                        System.out.println("   \n|__|\n   |");
                        break;
                    case 5:
                        System.out.println(" __ \n|__ \n __|");
                        break;
                    case 6:
                        System.out.println(" __ \n|__ \n|__|");
                        break;
                    case 7:
                        System.out.println(" __ \n   |\n   |");
                        break;
                    case 8:
                        System.out.println(" __ \n|__|\n|__|");
                        break;
                    case 9:
                        System.out.println(" __ \n|__|\n __|");
                        break;
                }

        }
}
