// Link to problem: https://leetcode.com/problems/product-of-array-except-self/submissions/969943978/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] suf = new int[n];
        pre[0] = nums[0];
        suf[n-1] = nums[n-1];
        for(int i = 1 ; i<n ; i++){
            pre[i] = nums[i]*pre[i-1];
        }
        for(int i = n-2 ; i>=0 ; i--){
            suf[i] = nums[i]*suf[i+1];
        }
        for(int i = 0 ; i<n ; i++){
            if(i == 0) nums[i] = (suf[i+1]);
            else if(i == n-1) nums[i] = (pre[i-1]);
            else nums[i] = (pre[i-1] * suf[i+1]);
        }
        return nums;
    }
}
