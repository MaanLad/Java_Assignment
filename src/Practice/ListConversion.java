package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ListConversion {
    public static void main(String[] args) {
        String [] arr={"Maan","Palu"};
//        System.out.println(Arrays.asList(arr));
//        List lst=Arrays.asList(arr);
        ArrayList<String> lst=new ArrayList<>(Arrays.asList(arr));
        System.out.println(lst);
        Collections.addAll(lst,arr);
        System.out.println(lst);

        Integer[] intArr={1,2,3,4,5,6,7};
        System.out.println(
                Arrays.stream(intArr).collect(Collectors.toList())
        );
    }
}
