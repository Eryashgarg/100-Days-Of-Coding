// Link to problem: https://leetcode.com/problems/sort-array-by-parity/description/
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l = 0 , r = nums.length-1;
        while(l<=r){
            if(nums[l] %2 == 1 && nums[r]%2 == 0){
                swap(nums,l,r);
                l++;
                r--;
            }
            if(nums[l]%2 == 0) l++;
            if(nums[r]%2 == 1) r--;
        }
        return nums;
    }
    static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
