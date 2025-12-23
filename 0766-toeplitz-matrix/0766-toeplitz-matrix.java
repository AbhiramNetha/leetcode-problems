class Solution {
    public boolean isvalidFun(int[][] matrix ,int y,int x){
        int r = matrix.length;
        int c = matrix[0].length;
        boolean bool = true;
        int i=y;
        int j=x;
        int temp = matrix[i][j];
        while(i<r && j<c){
            if(matrix[i][j]!=temp){
                bool = false;
            }
            i++;
            j++;
        }
        return bool; 

    }
    public boolean isToeplitzMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        boolean ans = true;
        for(int j=0;j<c;j++){
            boolean temp = isvalidFun(matrix,0,j);
            if(!temp){
                ans = false;
            }
        }
        for(int i=1;i<r;i++){
            boolean temp = isvalidFun(matrix,i,0);
            if(!temp){
                ans = false;
            }
        }
        return ans;
    }
}