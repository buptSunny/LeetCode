package LeetCode.Offer;

public class offer4 {
    public static void main(String[] args) {
        int [][]a = new int[4][4];
        int [][]b = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int target = 7;
        /*  这题不能用二分
            从右上角开始判断，如果== target，则返回
            如果比target大，该列舍弃
            如果比target小，该行舍弃。每次都取右上角的值。
         */

        int m = b.length-1;
        int n = b[0].length-1;
        for(int i = 0;i < m;i++){
            for(int j = m;j > 0;j--){
                if(b[i][j]==target){
                    System.out.println(i);
                    System.out.println(j);
                }
                else if(b[i][j]>target){
                    continue;
                }
                else if(b[i][j]<target){
                    break;
                }
            }
        }
    }
}
