package Assignment8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

interface CheckString{
    void checkStringList(ArrayList<String> str);
}
public class Fourth {
    public static void main(String[] args) {
        ArrayList<String> lstString=new ArrayList<>();
        lstString.add("Maan");
        lstString.add("Jhon");
        lstString.add("");
        lstString.add("");
        lstString.add("Arson");
        lstString.add("akash");
        lstString.add("dhruv");
        lstString.add("aditya");
        lstString.add("bb");


        System.out.println("String List:- "+lstString);
        //Counting Empty String using Lambda expressions
        CheckString checkEmpty=n-> System.out.println("Empty count :- "+n.stream().filter(String::isEmpty).count());
        checkEmpty.checkStringList(lstString);

        //Count String whose length is more than three
        CheckString checkCount=n-> System.out.println("String length of three count :- "+n.stream().filter(value->value.length()>3).count());
        checkCount.checkStringList(lstString);

        //Count number of String which starts with "a"
        CheckString checkCount_a=n-> System.out.println("String count starts with a :- "+n.stream().filter(value-> Pattern.matches("[a|A][a-zA-Z]*",value)).count());
        checkCount_a.checkStringList(lstString);

        //Remove all empty Strings from List
        CheckString removeEmptyString=n-> System.out.println("Empty removed :- "+lstString.stream().filter(value->!value.isEmpty()).toList());
        removeEmptyString.checkStringList(lstString);

        //Create a List with String more than 2 characters
        CheckString listMorethanTwoChar=n-> System.out.println("List with more than two character :- "+n.stream().filter(value->value.length()>2).toList());
        listMorethanTwoChar.checkStringList(lstString);

        //Convert String to uppercase and Join them with coma
        CheckString convertString=n-> System.out.println("To uppercase and join with n , :-"+n.stream().map(String::toUpperCase).collect(Collectors.joining(",")));
        convertString.checkStringList(lstString);


        System.out.println();

        //Create a List of the square of all distinct numbers
        List<Integer> l = Arrays.asList(1,2,3,4,5,6,6,3,4,2,7,9);
        System.out.println("List :-"+ l);
        System.out.println("List squre :- "+ l.stream().distinct().map(x->x*x).toList());


        //Get count, min, max, sum, and the average for numbers
        System.out.println();
        System.out.println("List:- " +  l.stream().distinct().toList());
        System.out.println("count:- " +  l.stream().distinct().count());
        System.out.println("Max:- " +  l.stream().distinct().max(Integer::compareTo).stream().toList().get(0));
        System.out.println("Min:- " +  l.stream().distinct().min(Integer::compareTo).stream().toList().get(0));
        System.out.println("Sum:- " +  l.stream().distinct().mapToInt(Integer::intValue).sum());
        System.out.println("Average :- "+l.stream().distinct().mapToDouble(Integer::doubleValue).average().getAsDouble());
    }
}
