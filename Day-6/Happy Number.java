// Link to problem: https://leetcode.com/problems/happy-number/
class Solution {
    public boolean isHappy(int n) {
        int count =0;
        while(n!=1 && count<n){
            n = sqdigit(n);
            count++;
            
        }
        if(n == 1) return true;
        return false;
    }
    public static int sqdigit(int n){
        int sum = 0;
        while(n!=0 ){
            sum += ((n%10)*(n%10));
            n = n/10;
        }
        return sum;
    }
}
