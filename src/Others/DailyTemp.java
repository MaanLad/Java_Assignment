package Assignment6;

import javax.swing.plaf.IconUIResource;
import java.util.Stack;

public class DailyTemp {
    public static void main(String[] args) {
        int [] tempratures={73,74,75,71,69,72,76,72};
        //output=[1,1,4,2,1,1,0,0]
        Stack<Integer> stack=new Stack<Integer>();
//        for (int i = 0; i < tempratures.length-1; i++) {
//            int count=1;
//            while(tempratures[i]>tempratures[count+ i]){
//                if((count+ i +1)==tempratures.length){
//                    count=0;
//                    break;
//                }else{
//                    count++;
//                }
//            }
//            stack.push(count);
//        }
        int[] res=new int[tempratures.length];
        for (int i = 0; i < tempratures.length; i++) {
        while(!stack.isEmpty() && tempratures[i]>tempratures[stack.peek()]){
            int prevDay=stack.pop();
            res[prevDay]=i-prevDay;
        }
        stack.push(i);
        }
        for(int element: res){
            System.out.println(element);
        }
    }
}
