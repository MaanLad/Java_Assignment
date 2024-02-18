package Others;

import java.net.Inet4Address;
import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        int[] height={2,1,5,6,2,3};
        ArrayList<ArrayList<Integer>> consicutiveH=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> sublist=new ArrayList<Integer>();
        for (int i = 1; i < height.length; i++) {
            sublist.add(height[i-1]);
            if(height[i-1]>=height[i]){
                consicutiveH.add(sublist);
                sublist=new ArrayList<Integer>();
                if(i==height.length-1){
                    sublist=new ArrayList<Integer>();
                    sublist.add(height[i]);
                    consicutiveH.add(sublist);
                }
            }else{
                if(i==height.length-1){
                    sublist.add(height[i]);
                    consicutiveH.add(sublist);
                }
            }
        }
        for (int i = 0; i < consicutiveH.size(); i++) {
            System.out.println(consicutiveH.get(i));
        }
    }
}
