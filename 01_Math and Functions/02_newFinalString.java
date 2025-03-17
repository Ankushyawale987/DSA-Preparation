/*

Jack was playing with his kid, and suddenly he realized that in a 
string S containing English letter and number, whenever there is a change 
from number to letter and from letter to number, his kid marks that elements.
By default, he always marks the first element of the string.

You have to make a new string from these highlighted ones, where all the
English letters are on the left side and all the numbers are on right side of 
the string. Your task is to return the final string.

Input Specification:

input1: A string value S representing the alphanumeric string.

Output Specification:

Return a string value based on above mentioned logic.
*/
import java.util.*;
class Main {
    public String getFinalString(String str){
        if(str == "" || str.length() == 1){
            return str;
        }
        StringBuilder letters = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        
        if(Character.isLetter(str.charAt(0))){
            letters.append(str.charAt(0));
        }else{
            numbers.append(str.charAt(0));
        }
        
        for(int i=1;i<str.length();i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            if(Character.isLetter(curr) && !Character.isLetter(prev)){
                letters.append(curr);
            }else if(Character.isDigit(curr) && !Character.isDigit(prev)){
                numbers.append(curr);
            }
            
        }
        return letters.toString() + numbers.toString();
    }
    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.getFinalString("A1BFD2C3D4")); 
        // Output: "ABCD1234"
        System.out.println(obj.getFinalString("1A234B3C4D")); 
        // Output: "ABCD1234"
        System.out.println(obj.getFinalString("X9Y48Z7"));   
        // Output: "XYZ987"
    }
}
