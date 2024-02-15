package Assignment5;

public class Ninth {

    static void printSubstring(String str,int beginIndex,int endIndex){
        char[] chArr = endIndex <= str.length() ? str.substring(beginIndex, endIndex+1).toCharArray() :
                str.substring(beginIndex, str.length()).toCharArray();
        for(char a : chArr) System.out.println(a);
    }
    public static void main(String[] args) {
        String str="maanlad";
        System.out.print("Input String :- "+str+"\n");
        int beginIndex=1;
        int endIndex=4;
        System.out.println("StartIndex:-"+beginIndex+"  EndingIndex:-"+endIndex);
        printSubstring(str,beginIndex,endIndex);
    }
}
