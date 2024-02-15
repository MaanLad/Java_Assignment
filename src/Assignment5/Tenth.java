package Assignment5;

import java.util.Arrays;

public class Tenth {

    //Method to check whether the given two strings are anagram or not
    public static boolean checkAnagram(String str1,String str2){
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
    public static void main(String[] args) {

        //Calling the method with two string
        System.out.println(checkAnagram("maan","aanm"));



    }
}
