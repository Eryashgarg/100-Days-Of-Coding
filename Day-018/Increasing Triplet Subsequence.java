// Link to problem: https://leetcode.com/problems/increasing-triplet-subsequence/description/
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int i = Integer.MAX_VALUE , j = Integer.MAX_VALUE , l = nums.length;
        if(l<3) return false;
        for(int idx = 0 ; idx < l;idx++){
            if(nums[idx]<=i) i = nums[idx];
            else if(nums[idx]<=j) j = nums[idx];
            else return true;
        }
        return false;
    }
}
