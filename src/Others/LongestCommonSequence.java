package Others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestCommonSequence {
    public static void main(String[] args) {
        int[] nums={100,4,200,1,3,2};
        Arrays.sort(nums);
        ArrayList<Integer> arrList=new ArrayList<>();
            for (int i = 0; i <nums.length ; i++) {
            arrList.add(nums[i]);
        }
            int result=0;
            int count=0;
            int i=0;
//        List<Integer> arrList = arrList.stream().distinct().toList();
//        System.out.println(arrList.get(count)+arrList.get(count+1)+1);

            while( i<arrList.size()){
                if(arrList.get(count)+1 == arrList.get(count + 1)){
                    count++;
                }else{
                    if(count>result){
                        result=count+1;
                    }
                    count=0;
                }
                i++;
            }
            if(count>result){
                result=count+1;
            }
        System.out.println(result);
    }
}
