// Link to problem: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0 ; i<haystack.length()-needle.length()+1 ; i++){
            if((haystack.substring(i,needle.length()+i)).equals(needle)) return i;
        }
      return -1;  
    }
    
}
