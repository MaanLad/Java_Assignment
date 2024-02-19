package Assignment6;
import java.util.*;
import java.util.stream.Collectors;

public class First_3 {
    public static void main(String[] args) {
        Integer[] arr = {1, 1, 2, 3, 2 ,3 ,1};
        List<Integer> arrList= Arrays.asList(arr);
        System.out.println(arrList);
//        System.out.println(arrList.stream().distinct().collect(Collectors.toList()));
//        List<Long> frequencyList= arrList.stream()
//                .distinct()
//                .map(n -> (long) arrList.stream().filter(value -> value == n).count())
//                .toList();
//        System.out.println(frequencyList);

        Map<Integer, Long> map = arrList
                .stream()
                .distinct()
                .collect(Collectors.toMap(entry -> entry, entry -> arrList.stream().filter(entry::equals).count()));
        System.out.println(map);
    }
}
