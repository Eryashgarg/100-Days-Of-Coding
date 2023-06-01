// Link to problem: https://leetcode.com/problems/find-peak-element/description/
class Solution {
    public int findPeakElement(int[] nums) {
        int l = nums.length;
        for(int i = 1 ; i<l ; i++){
            if(i == l-1){
                if(nums[i] > nums[i-1]) return i;
            }
            else{
            if(nums[i-1] < nums[i] && nums[i] > nums[i+1]) return i;}
        }     
        return 0;
    }
} 
