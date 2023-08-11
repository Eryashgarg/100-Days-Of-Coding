// Link to problem: https://leetcode.com/problems/max-points-on-a-line/description/
class Solution {
    public int maxPoints(int[][] arr) {
        int n=arr.length;
        if(n==1)
            return n; // if there is only one point
        int res=0;
        for(int i =0;i<n;i++)
        {
            HashMap<Double,Integer> uwu=new HashMap<>(); //to store angle to its count
            int max=0; // max angle of the point
            for(int j=0;j<n;j++)
            {
                if(i==j) // if the point is same we will continue
                    continue;
                double dy=(double)(arr[j][1]-arr[i][1]);
                double dx=(double)(arr[j][0]-arr[i][0]);
                double theta=Math.atan(dy/dx); //theta angle by atan function
                uwu.put(theta,uwu.getOrDefault(theta,0)+1); //store the count
                max=Math.max(max,uwu.getOrDefault(theta,0)); //also keep checking the max angle
            }
            res=Math.max(res,max+1); //for res count max+1 (+1 because we were not counting the angle at ith index in the loop)
        }
        return res;
    }
}
