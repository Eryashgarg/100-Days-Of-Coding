// Link to problem: https://leetcode.com/problems/sign-of-the-product-of-an-array/description/
class Solution {
    public int arraySign(int[] nums) {
        int n = 0 , z = nums.length;
        for(int i = 0 ; i<z ; i++){
            if(nums[i] == 0) return 0;
            else if(nums[i] < 0) n++;

        }
        if(n%2 == 0) return 1;
        else return -1;
    }
}
