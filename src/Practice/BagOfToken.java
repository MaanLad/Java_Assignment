package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class BagOfToken {
    public static void main(String[] args) {
//        power = 200
//        [100,200,300,400]
//        min (lst) - pow score++ faceup
//        200  + pow inc max (lst) score-- facedown
//        int[] tokens={100,200,300,400};
        int[] tokens={71,55,82};
//        int[] tokens={26};
        Arrays.sort(tokens);
        int power = 54;
//        int power = 200;
//        int power = 51;
//        List<Integer> ll = new ArrayList<>(Arrays.stream(tokens).boxed().toList());
        int signal = 0;
//        System.out.println(ll);
        int maxElement;
        int minElement;
        int i=0;
        int j=tokens.length-1;
        while((i-1)!=j){
            maxElement=tokens[j];
            minElement=tokens[i];
            if((maxElement==minElement) && power>maxElement){
            System.out.println("Power :- "+power+" Signal :- "+signal);
                power=power-minElement;
                signal++;
                i++;
            }
            else if((maxElement==minElement) && power<maxElement){
            System.out.println("Power :- "+power+" Signal :- "+signal);
//                signal--;
                i++;
            }
            else if(power>=minElement){
                System.out.println("Power :- "+power+" Signal :- "+signal);
                power = power - minElement;
                signal++;
                i++;
            }else{
                System.out.println("Power :- "+power+" Signal :- "+signal);
                if(signal==0){
                    break;
                }
                power=power+maxElement;
//                ll.remove(ll.size()-1);
                j--;
                signal--;
            }
        }
        System.out.println("Power :- "+power+" Signal :- "+signal);
//        while (!(ll.size() == 1)) {
////            if (!(ll.size() == 1)) {
//            maxElement = ll.get(ll.size() - 1);
//            minElement = ll.get(0);
//
////            if (signal==0){
////                power += maxElement;
////                ll.remove(maxElement);
////                signal--;
////            }
////                System.out.println(power + " : " + minElement + " min " + "Singal " + signal + " Max" + maxElement);
//            if (signal == 0 || power >= minElement) {
//                signal++;
//                System.out.println(power + " : " + minElement + " : " + signal);
//                power = power - minElement;
//                ll.remove(0);
//            }
//            if (signal > 0 && power < minElement) {
//                signal--;
//                System.out.println("in ---");
//                System.out.println(power + " : " + maxElement + " : " + signal);
////                System.out.println(power + " : " + maxElement + " max ");
//                power = power + maxElement;
//                if (!ll.isEmpty()) {
//                    ll.remove(ll.size() - 1);
//                }
//            }
//
//        }
//
//        if (power >= ll.get(0)) {
//            signal++;
////            System.out.println(power + " : " + minElement + " : " + signal);
//            power = power - ll.get(0);
//            ll.remove(0);
//        }else {
//            signal--;
//            System.out.println("in ---");
//            System.out.println("Did run?");
////            System.out.println(power + " : " + maxElement + " : " + signal);
////                System.out.println(power + " : " + maxElement + " max ");
//            power = power + ll.get(0);
//
////            if (!ll.isEmpty()) {
//            ll.remove(0);
////            }
//        }
//        System.out.println(power);
//        System.out.println(signal);
//        System.out.println(ll);
    }

}

