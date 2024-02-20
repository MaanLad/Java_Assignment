package Others;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums={2,7,11,15};
//        int[] nums={5,25,75};
        int target=9;
        int[] result=new int[2];
        int i=0;
        int j=nums.length-1;
        while(nums[i]+nums[j]!=target){
            int temp=target-nums[i];
            if(i==j){
                j=nums.length-1;
                i++;
            }else if (nums[j]+nums[i]!=target && i<=j){
                j--;
            }
        }
        result[0]=i+1;
        result[1]=j+1;
        System.out.println(result[0]+" and "+result[1]);
    }
}
