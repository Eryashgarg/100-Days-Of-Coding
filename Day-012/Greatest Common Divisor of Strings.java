// Link to problem: https://leetcode.com/problems/greatest-common-divisor-of-strings/description/
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!((str1+str2).equals(str2+str1))) return "";
        else{
            return str2.substring(0,gcd(str1.length(),str2.length()));
        }
    }
    static int gcd(int n1 , int n2){
        if(n2 == 0) return n1;
        else return gcd(n2 , n1%n2);
    }
}
