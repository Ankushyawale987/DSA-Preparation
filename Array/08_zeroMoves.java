/*
Case Study:
Given an integer array nums, 
move all 0's to the end of it 
while maintaining the relative order of the non-zero elements.

**Note that you must do this in-place without making a copy of the array.
*/

class Main {
    public void moveZeros(int[] nums){
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[count] = nums[i];
                count++;
            }
        }
        while(count < nums.length){
            nums[count] = 0;
            count++;
        }
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        Main obj = new Main();
        
        obj.moveZeros(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
    }
}

// Time Complexity: O(N)
// Space Complexity: O(1)
