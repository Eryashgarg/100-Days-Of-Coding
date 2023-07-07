// Link to problem: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
class Solution {
    public int lengthOfLongestSubstring(String s) {
       int l = 0 , r = 0 , max = 0;
       Set<Character> set = new HashSet<>();
       while(r < s.length()){
           char c = s.charAt(r);
           if(set.add(c)){
              max = Math.max(max , r-l+1);
              r++;
           }
           else{
               while(s.charAt(l) != c){
                   set.remove(s.charAt(l));
                   l++;
               }
               set.remove(c);
               l++;
           }
       }
       return max; 
    }
}
