import java.util.*;

public class Main{
    public int binarySearch(int[] arr, int k){
        
        int l = 0;
        int h = arr.length - 1;
        while(l<=h){
            int mid = l + (h - l)/2;
            if(arr[mid] == k){
                return mid;
            }else if(arr[mid] < k){
                l = mid + 1;
            }else{
                h = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7}; 
        Main sc = new Main();
        int ans = sc.binarySearch(arr, 7);
        System.out.println(ans);
    }
}

/************/
Time Complexity: O(log N)
Auxiliary Space: O(1)
