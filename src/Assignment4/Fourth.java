package Assignment4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fourth {
//    4.Print first letter of each word in a string using regex
    public static void main(String[] args) {
        String s = "The monarch";
        Pattern p = Pattern.compile("\\b\\w");
        Matcher m1 = p.matcher(s);
        System.out.println("First letter of each word from string \"" + s + "\" : ");
        while (m1.find()) {
            System.out.print(m1.group());
        }
    }
}
