package Assignment1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class second {
    public static void main(String[] args) {
        int[] arr = {19, 12, 31, 40, 34,40};
        int max1=0;
        int max2=0;
//        List lst= List.of(arr);
//        List<Integer> lst= Collections.addAll(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2 && max1 !=arr[i]){
                max2=arr[i];
            }
        }
        System.out.println("The winner is with marks :- "+max1);
        System.out.println("The runners up with marks :- "+max2);
    }
}
