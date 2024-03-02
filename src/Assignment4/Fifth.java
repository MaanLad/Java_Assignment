package Assignment4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fifth {
    public static void main(String[] args) {
        String s1 = "Maan";
        String s2 = "Laadd";

        System.out.println("Before :-");
        System.out.print("S1 ");
        System.out.println(s1);
        System.out.print("S2 ");
        System.out.println(s2);
        s1 = s1 + "," + s2;


//        Pattern r = Pattern.compile("^(.*?),\\s*(.*?)$");
        Pattern r = Pattern.compile("^[a-z](?=\\s)$");
        Matcher m = r.matcher(s1);

        if (m.find()) {
            s1 = m.group(2);
            s2 = m.group(1);
        }

        System.out.println("After:-");
        System.out.print("S1 ");
        System.out.println(s1);
        System.out.print("S2 ");
        System.out.println(s2);
    }
}
