package Others;

public class SimillarEnds {
    public static void main(String[] args) {
//        String s="cabaabac";
//        String s="aabccabba";
        String s="bbbbbbbbbbbbbbbbbbbbbbbbbbbabbbbbbbbbbbbbbbccbcbcbccbbabbb";
        int i=0;
        int j=s.length()-1;
        while(s.charAt(i)==s.charAt(j) && i<j){
            if(s.charAt(i)==s.charAt(i+1)){
                i++;
            }else if(s.charAt(j)==s.charAt(j-1)){
                j--;
            }else{
                i++;
                j--;
            }
        }
        System.out.println("i - "+i+" j- "+j);
        if(i==j){
            if(s.charAt(i-1)==s.charAt(j+1)){
                System.out.println(1);
            }
            System.out.println("0");
        }else{
            System.out.println((j-i)+1);
        }
    }
}
