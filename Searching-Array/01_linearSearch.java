
import java.util.*;
class Main {
    public int linearSearch(int[] arr,int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == k){
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,67,56};
        int k = 5;
        Main ob = new Main();
        int ans = ob.linearSearch(arr,k);
        System.out.println(ans);
    }
}


/*******************************/
Best Case Complexity: The best-case time complexity of the linear search is O(1).
Average Case Complexity: The average case time complexity of the linear search is O(n).
Worst-Case Complexity: The worst-case time complexity of the linear search is O(n).
Space: O(1)
