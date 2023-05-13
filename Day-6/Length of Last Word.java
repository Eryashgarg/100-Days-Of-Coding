// Link to problem: https://leetcode.com/problems/length-of-last-word/
class Solution {
    public int lengthOfLastWord(String s) {

        int count = 0 ;
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i) == ' ' && count ==0){
                continue;
            }
            if(s.charAt(i) != ' '){
                count++;
            }
            else if(s.charAt(i) == ' ' && count!=0){
                break;
            }
            
            
        }
        return count;
        
    }
    
}
