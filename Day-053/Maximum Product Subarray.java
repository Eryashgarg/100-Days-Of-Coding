// Link to problem: https://leetcode.com/problems/maximum-product-subarray/description/
class Solution {
    public int maxProduct(int[] nums) {
        int l = nums.length , ans = nums[0];
        for(int i = 0 ;i<l ; i++){
            int product = nums[i];
            for(int j = i+1 ; j<l ; j++){
                ans = Math.max(ans , product);
                product *= nums[j];

            }
            ans = Math.max(ans , product);

        }
    return ans;
    }
}
