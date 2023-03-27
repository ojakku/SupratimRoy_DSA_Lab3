package Q1;
import java.util.Stack;

public class balancingBrackets {

    static boolean checkingBracketsBalance(String bracketExpression) {

        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < bracketExpression.length(); i++) {
            
            char character = bracketExpression.charAt(i);

            if(character == '(' || character == '[' || character == '{') {
                stack.push(character);
                continue;
            }

            if(stack.isEmpty())
                return false;

            char c;

            switch(character) {

                case '}':
                    c = stack.pop();
                    if(c == '(' || c == '[')
                        return false;
                        break;
                
                case ')':
                    c = stack.pop();
                    if(c == '{' || c == '[')
                    return false;
                    break;
                
                case ']':
                    c = stack.pop();
                    if(c == '(' || c == '[')
                    return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }




    public static void main(String[] args) {
        
        String bracketExpression = "([[{}]])";
        Boolean result;

        result = checkingBracketsBalance(bracketExpression);

        if(result == true)
            System.out.println("The entered string has balanced brackets. ");
        else
            System.out.println("The entered string does not contain balanced brackets.");

    }
    
}