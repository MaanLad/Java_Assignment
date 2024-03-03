package Assignment6;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Third {

    public static List<Integer> generateFib(int num){
        return Stream.iterate(new int[]{0,1},s->new int[]{s[1],s[0]+s[1]}).limit(num).map(n->n[0]).collect(Collectors.toList());
    }

    public static void main(String[] args) {
//        System.out.println(Stream.iterate(new int[]{0,1},s->new int[]{s[1],s[0]+s[1]}).limit(10).map(n->n[0]).collect(Collectors.toList()));
        System.out.println(generateFib(50));
    }
}
