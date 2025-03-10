/*
Given an integer array nums, 
rotate the array to the right by k steps, 
where k is non-negative.

Some times k may be large number than nums length 
so k = k % n it will give remainder 
*/

import java.util.*;
class Main {
    public void rotateRight(int[] nums, int k){
        k = k % nums.length;
        int n = nums.length;
        
        reverseArray(nums, 0, n - 1);
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, n - 1);
        
    }
    public void reverseArray(int[] nums, int l, int n){
        while(l <= n){
            int temp = nums[l];
            nums[l] = nums[n];
            nums[n] = temp;
            l++;
            n--;
        }
    } 
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        
        Main obj = new Main();
        
        obj.rotateRight(nums, k);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
    }
}



/*
Time Complexity:
1. First reversal: reverseArray(nums, 0, n - 1)
    This reverses the entire array, taking O(n) time.
    
2. Second reversal: reverseArray(nums, 0, k - 1)
    This reverses the first k elements, taking O(k) time.
    
3. Third reversal: reverseArray(nums, k, n - 1)
    This reverses the remaining n - k elements, taking O(n - k) time.

**Total Time Complexity**
𝑂(𝑛)+𝑂(𝑘)+𝑂(𝑛−𝑘)=𝑂(𝑛)
Thus, the overall time complexity is O(n).
**Space Complexity**
O(1)
*/
