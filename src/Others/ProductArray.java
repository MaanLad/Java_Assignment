package Others;

import java.util.Arrays;

public class ProductArray {
    public static void main(String[] args) {
        int[] input={1,2,3,4};
//        int[] input={-1,1,0,-3,3};
        int len=input.length;
        int[] arr1=new int[len];
        int[] arr2=new int[len];
        int[] result=new int[len];

        int mul=1;
        for (int i = 0; i <len ; i++) {
            mul=mul*input[i];
            arr1[i]=mul;
        }
        mul=1;
        for (int i = len-1; i >=0 ; i--) {
           mul=mul*input[i];
           arr2[i]=mul;
        }
        result[0]=arr2[1];
        result[len-1]=arr1[len-2];
        for (int i = 1; i < result.length-1; i++) {
            result[i]=arr1[i-1]*arr2[i+1];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(result));
    }
}
