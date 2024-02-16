import java.util.Stack;

public class ValidParenthesis {

    public static boolean checkParenthesis(String s){
        if (s.length() % 2 != 0) return false;
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(stack.isEmpty() &&
                    (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')){
                return false;
            }else{
                if(s.charAt(i)==']' && stack.peek()=='[') stack.pop();
                else if(s.charAt(i)==')' && stack.peek()=='(') stack.pop();
                else if(s.charAt(i)=='}' && stack.peek()=='{') stack.pop();
                else stack.add(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s ="()[]{}";
        System.out.println(checkParenthesis(s));
    }
}
