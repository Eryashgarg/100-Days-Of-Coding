// Link to problem: https://leetcode.com/problems/range-sum-query-immutable/description/
class NumArray {
    private int[] sumArray;
    public NumArray(int[] nums) {
        sumArray = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            sumArray[i + 1] = sumArray[i] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return sumArray[right + 1] - sumArray[left];
    }
}

