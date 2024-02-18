package Assignment6;

import java.util.List;

public class First_1 {
    public static void main(String[] args) {
        List<Integer> arrList= List.of(1,2,3,2,3,3,1);
        List <Integer> distinctLst=arrList.stream().distinct().toList();
        System.out.println(distinctLst);
    }
}
