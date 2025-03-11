/*
Given two sorted arrays a[] and b[], 
where each array may contain duplicate elements , 
the task is to return the elements in the union of the two arrays in sorted order.

Union of two arrays can be defined as the set containing distinct common elements that are present in either of the arrays.
*/
import java.util.*;
class Main {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            set.add(b[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i: set){
            ans.add(i);
        }
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args){
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 6, 7};
        ArrayList<Integer> ans = findUnion(a, b);
        System.out.println(ans);
    }
}

/*
Time Compleixty : O( (m+n)log(m+n) ) . Inserting an element in a set takes logN time, 
where N is no of elements in the set. At max set can store m+n elements
{when there are no common elements and elements in arr,arr2 are distntict}. 
So Inserting m+n th element takes log(m+n) time. Upon approximation across 
inserting all elements in worst, it would take O((m+n)log(m+n) time.

Using HashSet also takes the same time, On average insertion in unordered_set 
takes O(1) time but sorting the union vector takes O((m+n)log(m+n))  time. 
Because at max union vector can have m+n elements.

Space Complexity : O(m+n) {If Space of Union ArrayList is considered} 

O(1) {If Space of union ArrayList is not considered}
*/
