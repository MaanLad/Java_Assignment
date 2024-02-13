package src4;

import java.util.regex.Pattern;
//1.Create a regular expression that accepts alphanumeric characters only. Its length must be six characters long only.
//2.Create a regular expression that accepts 10 digit numeric characters starting with 7, 8 or 9 only.
//3.Check if a given string is Pangram in Java
//4.Print first letter of each word in a string using regex
public class RegexS {
    public static void main(String[] args) {
    String regEx="[0-9a-zA-Z]{6}";
    String input="aba3";
    String regEx2="[789][0-9]{9}";
    String input2="7890900990";
    String regEx3="ab{2,}[a-z]*c";
    String input3="abbbnhfdahfhaihroewhfhdhsfc";
        System.out.println(Pattern.matches(regEx,input));
        System.out.println(Pattern.matches(regEx2,input2));
        System.out.println(Pattern.matches(regEx3,input3));
    }
}

