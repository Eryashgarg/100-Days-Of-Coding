//Link to problem: https://leetcode.com/problems/generate-parentheses/description/
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        helper(list, "", n, n);
        return list;
    }

    public void helper(List<String> list, String str, int left, int right) {
        if(left == 0 && right == 0)
            list.add(str);

        if(left > 0)
            helper(list, str + "(", left - 1, right);

        if(right > left)
            helper(list, str + ")", left, right - 1);
    }
}
