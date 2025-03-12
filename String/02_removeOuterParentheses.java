/*
1. A valid parentheses string means every opening ( has a corresponding closing ), and they are properly nested.
    
2. A primitive valid parentheses string is a smallest valid unit that cannot be split into two smaller valid parts.

3. We need to remove the outermost parentheses from each primitive part of the given string.


Break Down:
Input: s = "(()())(())"

Step-by-Step Decomposition:
1. Primitive parts:"(()())" "(())"
2. Remove outermost parentheses from each:
"(()())" → "()()" (remove first and last ())
"(())" → "()" (remove first and last ())
Combine results: "()()()"
Output: "()()()"
*/

/*
Final Approach
Use a counter (count) to track balance:
Increase when encountering (.
Decrease when encountering ).
When count > 1 (means count > 0) before encountering (, add it to the result (because it is not outermost).
When count > 1 after encountering ), add it to the result (because it is not outermost).
Return the new string with outer parentheses removed.
*/


import java.util.*;
class Main {
    public String removeOuterParentheses(String s){
        StringBuilder ans = new StringBuilder();
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' && count++ > 0){
                ans.append(s.charAt(i));
            }else if(s.charAt(i) == ')' && count-- > 1){
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Main obj = new Main();
        String s = "(()())(())";
        String ans = obj.removeOuterParentheses(s);
        System.out.println(ans);
    }
}

/*
TC: O(N)
SC: O(N)
*/
