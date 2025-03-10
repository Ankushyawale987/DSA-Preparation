
/*
Case Study:
Given an integer array nums sorted in non-decreasing order, 
remove the duplicates in-place such that each unique element appears only once.
The relative order of the elements should be kept the same. 
Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k. 
The remaining elements of nums are not important as well as the size of nums. Return k.
*/
class Main {
    public int removeDuplicates(int[] nums){
        int j = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[j] != nums[i]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
        // j + 1 is the length of unique element
    }
    public static void main(String[] args) {
        Main ob = new Main();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int ans = ob.removeDuplicates(nums);
        System.out.println(ans);
    }
}

// Time Complexity: O(N)
// Space Complexity: O(1)
