// Link to problem: https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/description/
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int l = arr.length;
        boolean b = true;
        int d = arr[1] - arr[0];
        for(int i = 2 ; i<l ; i++){
            if(arr[i]-arr[i-1] != d){
                b = false;
                break;
            }
        }
        return b;
    }
}
