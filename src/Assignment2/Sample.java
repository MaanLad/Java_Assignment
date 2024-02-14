package Assignment2;

import java.util.*;

public class Sample {
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

    public static void main(String[] args) {
// String[] strs = {"eat","tea","tan","ate","nat","bat","","",""};
        String[] strs = {"",""};
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
        System.out.println(list);
    }
}
