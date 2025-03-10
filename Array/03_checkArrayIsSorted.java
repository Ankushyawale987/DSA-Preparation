/*
**Check if Array Is Sorted and Rotated**
Case Study: 
1. Array is Sorted and In Ascending order So Remember and design the Solution in such way.
Array is given in non decending order means array is in Ascending Order (ascending / Increasing / Non-decreasing)
So check the count of of next array element is small or not,
if it is more than 1 then it is false 
otherwise true.
*/
import java.util.*;
class Main {
    public boolean CheckSorted(int[] arr){
        int c = 0;
        for(int i=0;i<arr.length - 1;i++){
            if(arr[i + 1] < arr[i]){
                c++;
            }
        }
        if(arr[0] < arr[arr.length - 1]){
            c++;
        }
        return c<=1;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        Main ob = new Main();
        boolean ans = ob.CheckSorted(arr);
        System.out.println(ans);
    }
}

//****//
// Time Complexity: O(N) - Sorting of Array
// Space Complexity: O(1)
