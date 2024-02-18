package Assignment6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class First_2 {
    public static void main(String[] args) {
        Integer[] arr = {19, 12, 31, 40, 34,40};
        List<Integer> arrLst= Arrays.asList(arr);
        List<Integer> newArrLst= arrLst.stream().sorted(Comparator.reverseOrder()).distinct().toList();
        System.out.println(newArrLst);
        System.out.println("The winner is with marks :- "+newArrLst.get(0)+"\nThe runners up with marks :- "+newArrLst.get(1));
    }
}
