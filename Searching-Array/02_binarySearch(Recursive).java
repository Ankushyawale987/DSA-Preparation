
import java.util.*;
class Main {
    public int binarySearch(int[] arr, int l, int h, int k){
        while(l<=h){
            int mid = l + (h - l) / 2;
            if(arr[mid] == k){
                return mid;
            }
            if(arr[mid] < k){
                return binarySearch(arr, mid + 1, h, k);
            }else{
                return binarySearch(arr, l, mid - 1, k);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,67,56};
        int l = 0;
        int h = arr.length - 1;
        
        int k = 5;
        Main ob = new Main();
        int ans = ob.binarySearch(arr, l, h, k);
        System.out.println(ans);
    }
}


/*****/
Best Case: O(1)
Average Case: O(N)
Worst Case: O(N)
