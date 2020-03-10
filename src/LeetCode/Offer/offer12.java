package LeetCode.Offer;

public class offer12 {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        int[] flag = new int[matrix.length];
        /*
            每个点都可以作为初始点
         */

        for(int i = 0; i < rows; i ++){
            for(int j = 0; j < cols; j ++){
                if(helper(matrix, rows, cols, i, j, str, 0, flag)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean helper(char[] matrix, int rows, int cols, int i, int j, char[] str, int k, int[] flag) {
        int index = i*rows + cols;
        if(i<0||j<0||i>rows||j>cols||matrix[index] != str[k]||flag[index]==1){
            return false;
        }
        if(k==str.length-1){
            return true;
        }
        flag[index] =  1;
        if(helper(matrix,rows,cols,i+1,j,str,k+1,flag)||
            helper(matrix,rows,cols,i,j+1,str,k+1,flag)||
                helper(matrix,rows,cols,i-1,j,str,k+1,flag)||
                helper(matrix,rows,cols,i,j-1,str,k+1,flag)
        ){
            return true;
        }
        flag[index] = 0;
        return false;
    }

    public static void main(String[] args) {
        System.out.println("ok");
    }
}
