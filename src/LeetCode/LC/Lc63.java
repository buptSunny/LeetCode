package LeetCode.LC;

public class Lc63 {
    public static void main(String[] args) {
        int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
        int[][] nums = new int[obstacleGrid.length][obstacleGrid[0].length];
        int tempi  = 0;
        int tempj = 0;
        while(tempi<obstacleGrid.length){
            if(obstacleGrid[tempi][0]==0){
                nums[tempi][0] = 1;
            }else{
                break;
            }
            tempi++;
        }
        while(tempj<obstacleGrid[0].length){
            if(obstacleGrid[0][tempj]==0){
                nums[0][tempj] = 1;
            }
            else{
                break;
            }
            tempj ++;
        }
        for(int i=1;i<obstacleGrid.length;i++){
            for(int j=1;j<obstacleGrid[0].length;j++){
                if(obstacleGrid[i][j]==1){
                    nums[i][j]=0;
                }
                else{
                    nums[i][j]=nums[i-1][j]+nums[i][j-1];
                }
            }
        }

        System.out.println(nums[2][2]);


    }
}
