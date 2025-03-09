// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public void LinearSort(int[] arr){
        for(int i=0;i<arr.length - 1;i++){
            for(int j=i + 1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        Main sc = new Main();
        int[] arr = {3,2,5,8,4,1};
        sc.LinearSort(arr);
        
    }
}

/****************************************************/
Time Complexity:
Best Case Complexity: O(1).
Average Case Complexity: O(n).
Worst-Case Complexity: O(n).


Space complexity : O(1)
