package Assignment8;

import java.util.regex.Pattern;

interface FunInterface{
     void checkString(String str);

}
public class First {
    public static void main(String[] args) {
        String input1="123maan";  //returns false
        String input2="maan";     //returns true
        FunInterface fi=(String value)-> System.out.println(Pattern.matches("[a-zA-Z]*",value));
        fi.checkString(input1);
        fi.checkString(input2);
    }
}
