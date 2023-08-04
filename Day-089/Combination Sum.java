// Link to problem: https://leetcode.com/problems/combination-sum/description/
class Solution {
  List<List<Integer>> ans;
  int n ;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans = new ArrayList<>();
        n = candidates.length;
        List<Integer> ds = new ArrayList<>();
        solve(0,candidates,target,ds);
        return ans;
    }
    public void solve(int i , int[]candidates , int target , List<Integer>ds){
       if(i==n){
         if(target == 0){
           ans.add(new ArrayList<>(ds));
         }
         return;
       }
       if(candidates[i] <= target){
         //pick
         ds.add(candidates[i]);
         solve(i,candidates,target -candidates[i],ds);
         ds.remove(ds.size()-1);
       }
       //not pick,ie. select other index;
       solve(i+1 , candidates , target , ds);
    }
}
