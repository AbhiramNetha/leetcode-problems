class Solution {
    public void setrows(int i,int[][] matrix){
        int m = matrix[0].length;
        int res = Integer.MAX_VALUE;
        for(int j=0;j<m;j++){
            if(matrix[i][j] > 0){
                matrix[i][j] = res;
            }
        }
    }
    public void setcolumns(int j,int[][] matrix){
        int n = matrix.length;
        int res = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(matrix[i][j] >0){
                matrix[i][j] = res;
            }
        }
    }
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 0){
                    setrows(i,matrix);
                    setcolumns(j,matrix);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == Integer.MAX_VALUE){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}