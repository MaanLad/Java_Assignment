package Assignment2;

public class Solution {
    public static void main(String[] args) {
        String s="ca";
        String t="act";
        StringBuilder tS=new StringBuilder(t);
        if(s.length()!=t.length()){
            System.out.println("false");
        }
        for(int i=0;i<s.length();i++){
                int check= tS.toString().indexOf(s.charAt(i));
//                System.out.println(check);
                if(check==-1){
                    System.out.println("False");
                }else{
                    tS.deleteCharAt(check);
                }
            System.out.println(tS);
        }
        System.out.println(true);
    }
}
