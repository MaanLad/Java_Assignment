package Assignment8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Second {
    public static void main(String[] args) {
        List<Integer> lst=new ArrayList<>();
        for (int i = 1; i < 8; i++) {
            lst.add(i);
        }

        System.out.println("Before:-"+lst.toString());


        lst.removeIf(n->n%2==1);
        //remove odd element in list
        System.out.println("After:-"+lst.toString());
    }
}
