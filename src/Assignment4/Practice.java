package Assignment4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice {
    public static void main(String[] args) {
        String s="2 cm";
//        Pattern p= Pattern.compile("[a-z](?=[0-9])");
        Pattern p= Pattern.compile("\\d*(?=\\scm)");
        Matcher m=p.matcher(s);
//        System.out.println(m.group(1));
//        Matcher m =Pattern.compile("(?=\\b)[a-z]")
//                .matcher("ages mix uses w");
        while(m.find()) {
            System.out.println(m.group(0));
        }
    }
}
