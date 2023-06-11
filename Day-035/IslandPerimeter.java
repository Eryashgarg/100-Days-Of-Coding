// Link to problem: https://leetcode.com/problems/island-perimeter/description/
class Solution {
    public int islandPerimeter(int[][] grid) {
        int p = 0 , r = grid.length , c = grid[0].length;
        for(int i = 0 ; i<r ; i++){
            for(int j = 0 ; j<c ; j++){
                if(grid[i][j] == 1) {
                    p+=4;
                     if(i>0 && grid[i-1][j] == 1) p-=2;
                if(j>0 && grid[i][j-1] == 1) p-=2;
                }
               
            }
        }
        return p;
        
    }
}
