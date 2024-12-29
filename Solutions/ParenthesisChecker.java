package Solutions;

import java.util.Stack;

public class ParenthesisChecker {

    public void checkParenthesis(String str){
        Stack<Character> stack = new Stack<>();
        boolean balanced = true;
        char[] chars = str.toCharArray();
        for (int i=0;i<chars.length;i++){
            if (chars[i] == '{' || chars[i] == '(' || chars[i] == '['){
                stack.push(chars[i]);
            } else if (chars[i] == '}' || chars[i] == ')' || chars[i] == ']') {
                if (stack.isEmpty()){
                    balanced = false;
                    break;
                }else {
                    char ch = stack.pop();
                    if (chars[i] == ']'){
                       if (ch != '['){
                           balanced = false;
                           break;
                       }
                    }else if (chars[i] == '{'){
                        if (ch != '}'){
                            balanced = false;
                            break;
                        }
                    } else if (chars[i] == '(') {
                        if (ch != ')'){
                            balanced = false;
                            break;
                        }
                    }
                }
            }
        }

        if (chars.length == stack.size())
            balanced = false;

        if (!balanced)
            System.out.println("Unbalanced parenthesis string");
        else
            System.out.println("Balanced parenthesis string");
    }

}
