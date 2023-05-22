// Link to problem: https://leetcode.com/problems/roman-to-integer/
class Solution {
    public int romanToInt(String s) {
        int len = s.length();
        int sum = 0;
        for(int i = 0 ; i < len ; i++){
            char c = s.charAt(i);
            if((i+1)< len && getValue(c) < getValue(s.charAt(i+1))) sum -= getValue(c);
            else sum += getValue(c); 
        }
        return sum;
    }
    static int getValue(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default : return 0;
        }
    }
}
