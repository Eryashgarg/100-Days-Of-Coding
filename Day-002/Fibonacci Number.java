// Link to problem: https://leetcode.com/problems/fibonacci-number/
class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int a = 0;
        int b = 1;
        int temp = a+b;
        for(int i=1;i<n;i++){
            temp = a+b;
            a = b;
            b = temp;
        }
        return temp;
}}
