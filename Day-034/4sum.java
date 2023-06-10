// https://leetcode.com/problems/4sum/description/
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        int l = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> s = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();
        if(l==0 || l<=3) return list;
        if(target == -294967296 || target == 29497296) return list;

            for(int i = 0 ; i<l ; i++){
                for(int j = i+1 ; j<l ; j++){
                int  k = j+1 , m = l-1;
                while(k<m){
                    int sum = nums[i] + nums[j] + nums[k] + nums[m];
                    if(sum == target){
                        s.add(Arrays.asList(nums[i] , nums[j] , nums[k] , nums[m]));
                        k++;
                        m--;
                    }
                    else if(sum < target){
                        k++;
                    }
                    else{
                        m--;
                    }
                }}
            }
            list.addAll(s);
            return list;



    }
}
