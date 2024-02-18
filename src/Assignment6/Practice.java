package Assignment6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        ArrayList<Integer> arrList=new ArrayList<Integer>();
        arrList.add(2);
        arrList.add(5);
        arrList.add(6);
        arrList.add(7);
//        for (Integer integer : arrList) {
//            System.out.println(integer);
//        }
//
//        arrList.forEach((n)-> System.out.println(Math.pow(n,2)));
        List<String> lstString=List.of("a","aa","aaa","aaaa","aaaaa");
        List<String> lstNewString = lstString.stream().map(n -> "*" + n).toList();
        lstNewString.forEach(System.out::println);
//        List<Integer> newList= arrList.stream().filter(n -> n > 5).toList();
//        newList.forEach((n)-> System.out.println(n));
    }
}
