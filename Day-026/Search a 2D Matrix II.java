// Link to problem: https://leetcode.com/problems/search-a-2d-matrix-ii/description/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int len = matrix.length;
        for(int i = 0 ; i < len ; i++){
            if(Arrays.binarySearch(matrix[i] , target) > -1) return true;
            
        }
        return false;
    }
}
