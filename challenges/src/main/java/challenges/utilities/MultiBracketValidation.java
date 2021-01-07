package challenges.utilities;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input){
        HashMap<Character, Character> brackets = new HashMap<Character, Character>();
        brackets.put('(',')');
        brackets.put('[',']');
        brackets.put('{','}');

        Stack<Character> stack = new Stack<Character>();

        for(int i=0; i < input.length(); i++){
            char current = input.charAt(i);

            if(brackets.keySet().contains(current)){
                stack.push(current);
            } else if(brackets.values().contains(current)) {
                if(!stack.empty() && brackets.get(stack.peek()) == current){
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
