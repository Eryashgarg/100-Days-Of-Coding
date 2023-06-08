// Link to problem: https://leetcode.com/problems/find-pivot-index/description/
class Solution {
    public int pivotIndex(int[] nums) {
      int leftsum=0,rightsum = 0;
        for(int i : nums)
            rightsum+=i;
        for(int i =0; i< nums.length;i++){
            rightsum-=nums[i];
            if(leftsum == rightsum)
                return i;
            leftsum +=nums[i];        
        }
        return -1; 
    }
}
