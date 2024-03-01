package Others;

import java.util.*;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        String input=" the            sky               is blue ";

        String[] arr=input.split("\\s+");
        List<String> arrList= Arrays.stream(arr).map(n->n.replace(" ","")).collect(Collectors.toList());
        Collections.reverse(arrList);
        String str=String.join(" ",arrList);
        System.out.println(str.trim());
    }
}
