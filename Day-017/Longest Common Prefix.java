// Link to problem: https://leetcode.com/problems/longest-common-prefix/description/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0] , s2 = strs[strs.length - 1];
        int idx = 0;
        while(idx<s1.length()){
            if(s1.charAt(idx) == s2.charAt(idx)) idx++;
            else break;
        }
        return s1.substring(0,idx);
    }
}
