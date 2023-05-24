// Link to problem: https://leetcode.com/problems/max-consecutive-ones/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        int[] max = new int[nums.length+1];
        int j = 0;
        int count = 0;
        

        for(int i = 0; i < nums.length ; i++){
            if(nums[i] == 1){
                count++;
            }
            else{
                max[j] = count;
                count = 0;
                j++;
            }
            max[j]=count;
        }
        int ans = max[0];
        for(int i = 0 ; i <= j ; i++){
            if(ans<max[i]){
                ans = max[i];
            }
        }
        return ans;
    }
}
