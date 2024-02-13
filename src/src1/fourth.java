package src1;

public class fourth {
    public static String bin1="011110";
    public static String bin2="0110";
    public static StringBuilder str=new StringBuilder();
    public static void main(String[] args) {
        if(bin1.length()>bin2.length()){
            int len=bin1.length()-bin2.length();
            for (int i = 0; i < len; i++) {
                bin2='0'+bin2;
            }
        }
        else if (bin2.length()>bin1.length()){
            int len=bin2.length()-bin1.length();
            for (int i = 0; i < len ; i++) {
                bin1='0'+bin1;
            }
        }
        char carry='0';
        for (int i = bin1.length()-1; i>=0 ;i--) {
           carry= sumBinary(i,carry);
        }
        str.append(carry);
        System.out.println("BinaryNumber1 :- "+bin1+"\nBinaryNumber2 :- "+bin2);
        System.out.println("Summation :- "+str.reverse().toString());
    }
    public static char sumBinary(int index,char carry){
        char first=bin1.charAt(index);
        char second=bin2.charAt(index);
        if(first=='1' && second=='1'&& carry=='1'){
            str.append('1');
            return '1';
        }
        else if(first=='1' && second=='1'&& carry=='0'){
            str.append('0');
            return '1';
        }
        else if (first != second && carry=='1'){
            str.append('0');
            return '1';
        }
        else if (first != second && carry=='0'){
            str.append('1');
            return '0';
        }
        else if (carry=='1'){
            str.append('1');
            return '0';
        }
        else{
            str.append('0');
            return '0';
        }
    }
}
