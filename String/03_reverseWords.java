/*
Given an input string s, reverse the order of the words.
The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces 
between two words. 
The returned string should only have a single space separating the words. 
Do not include any extra spaces.


Break Down:
When s.split(" +") is executed, it:
Splits the string s wherever one or more spaces are found.
+ Removes extra spaces between words.
Returns an array of words.
*/
import java.util.*;
class Main {
    public String reverseWords(String s){
        String[] temp = s.split(" +");
        StringBuilder ans = new StringBuilder();
        for(int i = temp.length - 1;i>=0;i--){
            ans.append(temp[i]);
            ans.append(" ");
        }
        return ans.toString().trim();
    }
    public static void main(String[] args) {
        Main obj = new Main();
        String s = "the sky is blue";
        String ans = obj.reverseWords(s);
        System.out.println(ans);
    }
}

/*
TC: O(N)
SC: O(N)
*/
