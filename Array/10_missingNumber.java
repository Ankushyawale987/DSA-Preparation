/*
Given an array nums containing n distinct numbers in the range [0, n], 
return the only number in the range that is missing from the array.
*/

class Main {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
        }
        int sum2 = n * (n + 1) / 2;
        return sum2 - sum;
    }
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        Main obj = new Main();
        int ans = obj.missingNumber(nums);
        System.out.println(ans);
    }
}

/*
TC: O(N)
SC: O(1)
*/
