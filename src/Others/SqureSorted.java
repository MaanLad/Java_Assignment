package Others;

import java.util.Arrays;

public class SqureSorted {
    public static void main(String[] args) {
        int[] arr={-4,-1,0,3,10};
        int [] sqrArr=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            sqrArr[i]=arr[i]*arr[i];
        }
        Arrays.sort(sqrArr);
        System.out.println(Arrays.toString(sqrArr));
    }
}
