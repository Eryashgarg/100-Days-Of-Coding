// Link to problem: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
class Solution {
    public int findMin(int[] nums) {
        int l = nums.length , min = nums[0];
        for(int i = 0 ; i<l ; i++){
            if(min>nums[i]) min = nums[i];
        }
        return min;
    }
}
