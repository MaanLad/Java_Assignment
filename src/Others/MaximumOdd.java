package Others;

import java.util.Arrays;

public class MaximumOdd {
    public static void main(String[] args) {
        String s="01011";
        StringBuilder sb=new StringBuilder();
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        for (int i = 0; i < count-1; i++) {
            sb.append('1');
        }
        for (int i = 0; i < s.length()-count; i++) {
            sb.append('0');
        }
        sb.append('1');
        System.out.println(sb);
    }
}
