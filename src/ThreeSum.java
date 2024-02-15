import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr={-1,0,1,2,-1,-4};

        List<Integer> lst= new ArrayList<>();
        for (int i = 0; i < arr.length  ; i++) {
            lst.add(arr[i]);
        }

        ArrayList<Integer> positive=new ArrayList<>();
        ArrayList<Integer> negative=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                negative.add(arr[i]);
            }else{
                positive.add(arr[i]);
            }
        }
//        System.out.println(positive);
//        System.out.println(negative);

        List<List<Integer>> result=new ArrayList<List<Integer>>();

        for (int i = 0; i < positive.size(); i++) {
        ArrayList<Integer> sublist=new ArrayList<>();
            for (int j = 0; j < negative.size(); j++) {
                if(positive.get(i)+negative.get(j%negative.size())+ negative.get((j+1)%negative.size())==0){
                    sublist.add(positive.get(i));
                    sublist.add(negative.get(j%negative.size()));
                    sublist.add(negative.get((j+1)%negative.size()));
                }
            }
            if(!result.contains(sublist) && !sublist.isEmpty())result.add(sublist);
        }


        for (int i = 0; i < negative.size(); i++) {
            ArrayList<Integer> sublist=new ArrayList<>();
            for (int j = 0; j < positive.size(); j++) {
                if(negative.get(i)+positive.get(j%positive.size())+ positive.get((j+1)%positive.size())==0){
//                    System.out.println(negative.get(i)+""+positive.get(j%positive.size())+""+ positive.get((j+1)%negative.size()));
                    sublist.add(negative.get(i));
                    sublist.add(positive.get(j%positive.size()));
                    sublist.add(positive.get((j+1)%positive.size()));
                }
            }
            if(!result.contains(sublist) && !sublist.isEmpty())result.add(sublist);
        }

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
