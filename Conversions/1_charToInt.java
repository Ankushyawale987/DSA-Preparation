/*
Using ASCII Values
Using String.valueOf() Method
Using Character.getNumericValue() Method
*/


public class Main{
    public static void main(String[] args){
        // 1-Using ascii value
        char c = '3';
        int a = c - '0';
        System.out.println("Integer value is:" + a);
        System.out.println("Charcater value is:" + c);
        
        for(char i='a'; i<='z';i++){
            System.out.println((int)i);
        }
        
        // 2 String.valueOf() Method
        char x = '4';
        int ans = Integer.parseInt(String.valueOf(x));
        System.out.println(ans);
        
        // 3 Using Character.getNumericValue() Method
        char j = '9';
        int k = Character.getNumericValue(j);
        System.out.println(k);
    }
}



