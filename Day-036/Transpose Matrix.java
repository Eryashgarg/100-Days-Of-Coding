// Link to problem: https://leetcode.com/problems/transpose-matrix/description/
class Solution {
    public int[][] transpose(int[][] matrix) {
        int r = matrix.length , c = matrix[0].length;
        int[][] tran = new int[c][r];
        for(int i = 0 ; i<r ; i++){
            for(int j = 0; j<c ; j++){
                tran[j][i] = matrix[i][j];
            }
        }
        return tran;
    }
    
}
