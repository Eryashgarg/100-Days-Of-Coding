// Link to problem: https://leetcode.com/problems/3sum/description/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> s = new HashSet<>();
        List<List<Integer>> l = new ArrayList<>();
        for(int i = 0 ; i<len ; i++){
            int j = i+1 , k = len - 1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    s.add(Arrays.asList(nums[i] , nums[j] , nums[k]));
                    j++;
                    k--;

                }
                else if(sum < 0) j++;
                else k--;
            }
        }
        l.addAll(s);
        return l;

    }
}
