package Others;

import java.security.SecureRandom;
import java.util.Arrays;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s="ab_a";
        s=s.toLowerCase();
        char[] charArr=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < charArr.length; i++) {
            if(charArr[i]>=97 && charArr[i]<=122 ||charArr[i]>=48 && charArr[i]<=57){
                sb.append(charArr[i]);
            }
            else{
                continue;
            }
        }
        System.out.println(sb.toString());
        System.out.println(Arrays.equals(sb.toString().toCharArray(),sb.reverse().toString().toCharArray()));
    }
}
