/*
Case Study:
1. Used toCharArray(): Since String is immutable, we convert it into a char array
2. Swapped characters in the array: Using temporary storage (temp).
3. Converted char[] back to String: Using new String(charArray).
*/
class Main {
    public static void main(String[] args) {
        String a = "Ank";
        char[] arr = a.toCharArray();
        int l = 0;
        int h = arr.length - 1;
        while(l <= h){
            char temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++;
            h--;
        }
        String ans = new String(arr);
        System.out.println(ans);
    }
}
