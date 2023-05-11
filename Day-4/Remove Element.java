// Link to problem: https://leetcode.com/problems/remove-element/
class Solution {
    public int removeElement(int[] nums, int val) {
        int j  =  0;
        int temp[] = new int[nums.length];
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]!=val){
                temp[j++] = nums[i];
            }
            
        }
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = temp[i];
        }
        return j;
        
    }
}
