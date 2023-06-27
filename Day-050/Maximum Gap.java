// Link to problem: https://leetcode.com/problems/maximum-gap/description/
class Solution {
    public int maximumGap(int[] arr) {
        Arrays.sort(arr);
        int l=arr.length;
        if(l<2)
        return 0;
        int max=0;
        for(int i=0;i<l-1;i++)
        {
            int c=arr[i+1]-arr[i];
            if(c>max)
            max=c;
          
        }
        return max;
        
    }
}
