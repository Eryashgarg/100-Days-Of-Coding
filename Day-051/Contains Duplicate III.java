// Link to problem: https://leetcode.com/problems/contains-duplicate-iii/description/
class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        if (indexDiff < 1 || valueDiff < 0)
            return false;
        SortedSet<Long> set = new TreeSet<Long>();
        for (int j = 0; j < nums.length; j++) 
        {
            long leftBoundary = (long) nums[j] - valueDiff;
            long rightBoundary = (long) nums[j] + valueDiff + 1;
            SortedSet<Long> subSet = set.subSet(leftBoundary, rightBoundary);
            if (!subSet.isEmpty())
                return true;
            set.add((long) nums[j]);
            if (j >= indexDiff) 
            {
                set.remove((long) nums[j - indexDiff]);
            }
        }
        return false;
    }
}
