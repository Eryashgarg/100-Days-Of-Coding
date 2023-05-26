// Link to problem: https://leetcode.com/problems/multiply-strings/description/
import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        String str = String.valueOf(n1.multiply(n2));
        return str;
    }
}
