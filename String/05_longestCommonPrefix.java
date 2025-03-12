import java.util.*;
class Main {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String f = strs[0];
        String l = strs[strs.length - 1];
        int index = 0;
        for(int i=0;i<strs.length;i++){
            if(f.charAt(i) == l.charAt(i)){
                index++;
            }else{
                break;
            }
        }
        return index == 0 ? "": f.substring(0, index);
    }
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        
        Main obj = new Main();
        String ans = obj.longestCommonPrefix(strs);
        System.out.println(ans);
    }
}


/*
TC: O(N),N is the length of First word
Sc: O(1)
*/
