package Assignment4;

import java.util.regex.Pattern;

//https://www.logicbig.com/tutorials/core-java-tutorial/java-regular-expressions/regex-lookahead.html#:~:text=Lookaheads%20are%20zero%20length%20assertions%2C%20that%20means%20they,which%20we%20will%20cover%20in%20the%20next%20tutorial.

public class RegexS {
    public static void main(String[] args) {
        //1.Create a regular expression that accepts alphanumeric characters only. Its length must be six characters long only.
        String regEx="[0-9a-zA-Z]{6}";
        String input= "aba3";

        //2.Create a regular expression that accepts 10 digit numeric characters starting with 7, 8 or 9 only
        String regEx2="[789][0-9]{9}";
        String input2="7890900990";

        //3.Check if a given string is Pangram in Java
        String regEx3= "^(?=.*a)(?=.*b)(?=.*c)(?=.*d)(?=.*e)(?=.*f)(?=.*g)(?=.*h)(?=.*i)(?=.*j)(?=.*k)(?=.*l)(?=.*m)(?=.*n)(?=.*o)(?=.*p)(?=.*q)(?=.*r)(?=.*s)(?=.*t)(?=.*u)(?=.*v)(?=.*w)(?=.*x)(?=.*y)(?=.*z)[a-zA-Z]{26,}$";
        String input3="qwertyuiopasdfghjklzxcvbnmm";



        System.out.println("First:-"+Pattern.matches(regEx,input));
        System.out.println("Second:-"+Pattern.matches(regEx2,input2));
        System.out.println("Third:-"+Pattern.matches(regEx3,input3));
    }
}




