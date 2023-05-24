// Link to problem: https://leetcode.com/problems/rearrange-array-elements-by-sign/
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int j = 0;
        int k = 0;
        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];
        for(int i = 0 ; i<nums.length;i++){
            if(nums[i]>0){
                pos[j++] = nums[i];
            }
            else{
                neg[k++] = nums[i];
            }
        }
        int l = 0;
        int m = 0;
        for(int i = 0 ; i<nums.length ; i++){
            if(i%2 == 0){
                nums[i] = pos[l++];
            }
            else{
                nums[i] = neg[m++];
            }
        }
        return nums; 
    }
}
