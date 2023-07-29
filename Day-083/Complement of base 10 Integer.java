// Link to problem: https://leetcode.com/problems/complement-of-base-10-integer/submissions/
class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0) return 1;
        int m = n;
        int mask = 0;

        while(m != 0){
            mask = (mask << 1) | 1; // calculating mask 
            m = m >> 1; 
        }
        int ans = ~n & mask;
        return ans;
    }
}
