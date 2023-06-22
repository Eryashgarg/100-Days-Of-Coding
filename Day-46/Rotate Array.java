// Link to problem: https://leetcode.com/problems/rotate-array/description/
class Solution {
    public void rotate(int[] arr, int k) {
         int n = arr.length;
         k = k%n;
        
         reverse(arr , 0 , n-k-1);
         reverse(arr , n-k , n-1);
         reverse(arr , 0 , n-1);
         System.out.println(Arrays.toString(arr));

        
    }
    static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse(int[] arr , int s , int e){
        while(s<e){
            swap(arr , s , e);
            s++;
            e--;
        }
    }
}
