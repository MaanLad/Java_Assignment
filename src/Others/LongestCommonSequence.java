package Others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestCommonSequence {
    public static void main(String[] args) {
        int[] nums={100,4,200,1,3,2};
//        int[] nums={0,-1};
//        int[] nums={9,1,4,7,3,-1,0,5,8,-1,6};
//        int[] nums={-8,-2,-3,-9,-6,7,9,-8,9,2,-8};
        Arrays.sort(nums);
        ArrayList<Integer> arrlist=new ArrayList<>();
            for (int i = 0; i <nums.length ; i++) {
            arrlist.add(nums[i]);
        }
            int result=1;
            int count=0;
            int i=0;
        List<Integer> arrList = arrlist.stream().distinct().toList();
        System.out.println(arrList);
        System.out.println(arrList);
            while( i<arrList.size()-1){
                if(arrList.get(i)+1 == arrList.get(i + 1)){
                    count++;
                }else{
                    if(count>=result){
                        result=count+1;
                    }
                    count=0;
                }
                i++;
            }
            if(count>=result){
                result=count+1;
            }
        System.out.println(result);
    }
}
