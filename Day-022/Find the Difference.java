// Link to problem: https://leetcode.com/problems/find-the-difference/description/
class Solution {
    public char findTheDifference(String s, String t) {
    char ans = 'a';
    s = s + " ";
    char[] c1 = s.toCharArray();
    char[] c2 = t.toCharArray();
    Arrays.sort(c1);
    Arrays.sort(c2);
    for(int i = 0 ; i < t.length() ; i++){
        if(c1[i] != c2[i]) ans = c2[i];
    }
    return ans;
   

    }
}
