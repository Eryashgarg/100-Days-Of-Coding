// Link to problem: https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/
class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i = 0 ; i<grid.length ; i++){
            for(int j = 0 ; j<grid[i].length ; j++){
                if(grid[i][j]<0) count++;
            }
        }
        return count;
    }
}
