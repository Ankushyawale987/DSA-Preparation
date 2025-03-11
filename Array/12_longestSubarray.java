/*
Given an array arr containing integers and an integer k, 
your task is to find the length of the longest subarray 
where the sum of its elements is equal to the given value k. 
If there is no subarray with sum equal to k, return 0.

*/
import java.util.*;
class Main {
    public int longestSubarray(int[] arr, int k) {
        int sum = 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            //Step-1: calculate the prefix sum till index i:
            sum += arr[i];
            
            //Step-2: if the sum = k, update the maxLen:
            if(sum == k){
                max = Math.max(max, i + 1);
            }
            
            
            //Step-3: calculate the sum of remaining part i.e. x-k:
            int rem = sum - k;
            
            //Step-4: Calculate the length and update maxLen:
            if(map.containsKey(rem)){
                int len = i - map.get(rem);
                max = Math.max(max, len);
            }
            
            //Step-5: Finally, update the map checking the conditions:
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,1,1,4,2,3};
        int k = 3;
        Main obj = new Main();
        int ans = obj.longestSubarray(nums, k);
        System.out.println(ans);
    }
}

/*
Time Complexity: O(N), where N = size of the array.
Space Complexity: O(N) as we are using a map data structure.
*/
