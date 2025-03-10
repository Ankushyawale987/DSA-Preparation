// Case-1: Length is Zero
// Case-2: Length is 1
// Case-3: find Second Small Number
// I have implemented the login for the Second Small is reapeated in the array
import java.util.*;
class Main {
    public int SecondSmall(int[] arr){
        int n = arr.length;
        if(n == 0){
            return -1;
        }else if(n == 1){
            return arr[0];
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i] == arr[0]){
                continue;
            }else{
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {54,32,1,0,1,34,5,55,89,100, 100, 100,100};
        Main ob = new Main();
        int ans = ob.SecondSmall(arr);
        System.out.println(ans);
    }
}

//****//
// Time Complexity: NlogN - Sorting of Array
// Space Complexity: O(1)
