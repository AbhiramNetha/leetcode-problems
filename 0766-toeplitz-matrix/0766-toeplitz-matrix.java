class Solution {
    public boolean isvalid(int[][] arr,int y, int x){
        int r = arr.length;
        int c = arr[0].length;
        int i = x;
        int j =y;
        int tem = arr[i][j];
        while(i<r && j<c){
            if(tem != arr[i][j]){
                return false;
            }
            i++;
            j++; 
        }
        return true;
    }
    public boolean isToeplitzMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        boolean temp = true;
        for(int i=0;i<r;i++){
            temp = isvalid(matrix,0,i);
            if(!temp){
                return false;
            }
        } 
        for(int i=1;i<c;i++){
            temp = isvalid(matrix,i,0);
            if(!temp){
                return false;
            }
        }
        return temp;

    }
}