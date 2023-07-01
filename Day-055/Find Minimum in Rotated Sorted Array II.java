// Link to problem: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/description/
class Solution {
    public int findMin(int[] nums) {
        int m = nums[0] , l = nums.length;
        for(int i = 0 ; i<l ; i++ ){
            if(nums[i]<m) m = nums[i];
        }
        return m;

    }
}
