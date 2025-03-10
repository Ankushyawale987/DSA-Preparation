// Case-1: Length is Zero
// Case-2: Length is 1
// Case-3: find Second Large Number
import java.util.*;
class Main {
    public int SecondLarge(int[] arr){
        int n = arr.length;
        if(n == 0){
            return -1;
        }else if(n == 1){
            return arr[0];
        }
        Arrays.sort(arr);
        
        for(int i=arr.length - 1;i>=0;i--){
            if(arr[i] == arr[arr.length - 1]){
                continue;
            }else{
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {54,32,1,34,5,55,89,100, 100, 100,100};
        Main ob = new Main();
        int ans = ob.SecondLarge(arr);
        System.out.println(ans);
    }
}

//****//
// Time Complexity: NlogN - Sorting of Array
// Space Complexity: O(1)
