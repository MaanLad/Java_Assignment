package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ValidWordInPuzzel {
    public static void main(String[] args) {
        String[] word={"aaaa","asas","able","ability","actt","actor","access"};
        ArrayList<String> wordList=new ArrayList<>(Arrays.asList(word));
        String[] puzzles={"aboveyz","abrodyz","abslute","absoryz","actresz","gaswxyz"};
        List<Integer> result;
        ArrayList<String> regexList=new ArrayList<>();
        for (int i = 0; i < puzzles.length; i++) {
            String p=puzzles[i];
            String puzzleRegex="(?=.*"+p.charAt(0)+")"+"["+p+"]*";
            regexList.add(puzzleRegex);
        }
//        for (int i = 0; i < puzzles.length; i++) {
//            String p=puzzles[i];
//            String firstOfP=""+p.charAt(0);
//            p=p.replace(firstOfP,"");
//            String puzzleRegex="["+p+"]*";
////            System.out.println(firstOfP);
////            System.out.println(puzzleRegex);
//            System.out.println();
//            int count=0;
//            for (int j = 0; j < wordList.size(); j++) {
//                if (wordList.get(j).contains(firstOfP)) {
//                    word[j] = word[j].chars().filter(n -> !Objects.equals(n, (int) firstOfP.charAt(0))).distinct().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
//                    if (Pattern.matches(puzzleRegex, word[j])) {
//                        count++;
//                    }
//                }
//            }
//            result.add(count);
//        }
        result=regexList.stream().map(n->wordList.stream().map(str->str.chars().distinct().mapToObj(c -> String.valueOf((char)c)).collect(Collectors.joining())).filter(w->Pattern.matches(n,w)).count()).map(Math::toIntExact).toList();
        System.out.println(regexList);
        System.out.println(result);
    }
}
