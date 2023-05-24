// Link to problem: https://leetcode.com/problems/valid-parentheses/description/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> res = new Stack<>();
        int len = s.length();
        for(int i = 0 ; i<len ; i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{') res.push(c);
            else{ if(res.isEmpty()) return false;
            char p = res.peek();
            if(c == ')' && p == '(' || c == ']' && p == '[' || c == '}' && p == '{' ) res.pop();
            else return false;
            }

        }
        return res.isEmpty();
    }
}
