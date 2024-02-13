import java.util.regex.Pattern;

public class RegexS {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[0-9a-zA-Z]{0,6}","aba3"));
    }
}
