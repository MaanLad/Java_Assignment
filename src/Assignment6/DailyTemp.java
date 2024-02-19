package Assignment6;

import javax.swing.plaf.IconUIResource;
import java.util.Stack;

public class DailyTemp {
    public static void main(String[] args) {
        int [] tempratures={73,74,75,71,69,72,76,78};
        //output=[1,1,4,2,1,1,0,0]
        Stack<Integer> stack=new Stack<Integer>();
        for (int i = 0; i < tempratures.length-1; i++) {
            int count=1;
            int flag=i;
            while(tempratures[flag]>tempratures[count+flag]){
                if((count+flag+1)==tempratures.length){
                    count=0;
                    break;
                }else{
                    count++;
                }
            }
            stack.push(count);
        }
        System.out.println(stack);
    }
}
