/*
Given string num - representing a large integer. 
Return the largest-valued odd integer (as a string) that 
is a non-empty substring of num, or an empty string "" if no odd integer exists.

A substring is a contiguous sequence of characters within a string.
*/
class Main {
    public String largestOddNumber(String num) {
        for(int i=num.length() - 1; i>=0;i--){
            char c = num.charAt(i);
            if(c % 2 == 1){
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        Main obj = new Main();
        String s = "34452";
        String ans = obj.largestOddNumber(s);
        System.out.println(ans);
    }
}

/*
TC: O(N)
SC: O(N)
*/
