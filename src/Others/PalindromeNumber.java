package Others;

public class PalindromeNumber {
    public static void main(String[] args) {
        int input=121;
        int reversed_num=0;
        while(input>0){
            reversed_num=(reversed_num*10)+(input%10);
            input=input/10;
        }
        if(input==reversed_num){
            System.out.println(true);
        }
    }
}
