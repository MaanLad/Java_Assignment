package Assignment5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tenth {

    //Method to check whether the given two strings are anagram or not
    public static boolean checkAnagram(String str1,String str2){
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
    public static ArrayList<String> newList=new ArrayList<String>();

    public static boolean hasValue(String str){

        if(newList.contains(str)){
            return false;
        }
        else{
            newList.add(str);
            return true;
        }
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>  list= new ArrayList<List<String>>();

        for (int i = 0; i < strs.length; i++) {
            List<String> sublist=new ArrayList<String>();
            char[] arr=strs[i].toCharArray();
            sublist.add(strs[i]);
            Arrays.sort(arr);
            if(hasValue(Arrays.toString(arr))){
                for (int j = 0; j < strs.length; j++) {
                    char[] arr2=strs[j].toCharArray();
                    Arrays.sort(arr2);
                    if(i!=j && Arrays.equals(arr2,arr)){
                        sublist.add(strs[j]);
                    }
                }
                list.add(sublist);
            }

        }
        return list;
    }

    public static void main(String[] args) {
        //Calling the method with two string
        System.out.println("Check anagram :-"+checkAnagram("maan","aanm"));

        String[] strs = {"art","rat","tar","meats","steam"};
        System.out.println();
        System.out.println("Input array :- "+Arrays.toString(strs));
        System.out.println("Output :- ");
        List<List<String>> lst=groupAnagrams(strs);
        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i));
        }
    }

}
