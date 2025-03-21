/**


mergeSort(arr, low, high)
1. If low >= high
      Return
2. mid = low + (high - low) / 2
3. mergeSort(arr, low, mid)
4. mergeSort(arr, mid + 1, high)
5. merge(arr, low, mid, high)

merge(arr, low, mid, high)
1. Create temp array to store merged result
2. Set left = low, right = mid + 1
3. While left <= mid and right <= high
     a. If arr[left] <= arr[right], add arr[left] to temp and increment left
     b. Else add arr[right] to temp and increment right
4. Add remaining elements from the left half
5. Add remaining elements from the right half
6. Copy temp array back to arr[low...high]


*/
import java.util.*;
class Main {
    public void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                list.add(arr[left]);
                left++;
            }else{
                list.add(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            list.add(arr[left]);
            left++;
        }
        while(right <= high){
            list.add(arr[right]);
            right++;
        }
        
        
        for(int i=low;i<=high;i++){
            arr[i] = list.get(i - low);
        }
    }
    public void mergeSort(int[] arr, int low, int high){
        if(low < high){
            int mid = low + (high - low) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }else{
            return;
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,3,5,2,6,8,78,54,0};
        Main obj = new Main();
        
        System.out.print("Before Sorting: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        
        System.out.print("After Sorting: ");
        obj.mergeSort(arr, 0, arr.length - 1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        
        
    }
}

/*

TC: O(NlogN)
SC: O(N)

*/
