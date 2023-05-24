// Link to problem: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        int[] temp = new int[nums.length];
        for(int i = 1 ; i<nums.length ; i++){
                if(nums[i-1]!=nums[i]){
                temp[j++] = nums[i-1];
                
            }       
        }
        temp[j++] = nums[nums.length-1];
        for(int i = 0 ; i<temp.length ; i++){
            nums[i] = temp[i];
        }
        return j;
    }
}
