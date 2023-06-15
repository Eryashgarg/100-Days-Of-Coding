// Link to problem: https://leetcode.com/problems/rotate-image/description/
class Solution {
    public void rotate(int[][] matrix) {
        int[][] rotated = new int[matrix.length][matrix[0].length];
        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = i ; j<matrix[0].length ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0 ; i<matrix.length ; i++){
            int l = 0 , r = matrix[0].length-1;
            while(l<r){
                int t = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = t;
                l++;
                r--;
            }
        }
        System.out.println(Arrays.deepToString(matrix));

        

        
    }

}
