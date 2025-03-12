/*
To determine if two strings s and t are isomorphic, 
we need to check whether there is a one-to-one mapping between the characters of s and t, meaning:

Each character in s maps to a single unique character in t.
No two different characters in s map to the same character in t.
The order of characters is preserved.
*/
import java.util.*;
class Main {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                char c = map.get(s.charAt(i));
                if(c != t.charAt(i)) return false;
            }else if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), t.charAt(i));
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        
        Main obj = new Main();
        boolean ans = obj.isIsomorphic(s, t);
        System.out.println(ans);
 }
}
