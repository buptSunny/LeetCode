package LeetCode.LC;

import java.util.Arrays;

public class Lc79 {
//    static char[][] board = {
//            {'A','B','C','E'},
//            {'S','F','C','S'},
//            {'A','D','E','E'},
//    };
    static char[][] board = {
        {'a','b'}
    };
    static boolean[][] marked = new boolean[board.length][board[0].length];
    public static void main(String[] args) {
        String word = "ba";
        char[] chword = word.toCharArray();
        int start = 0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                Boolean flag = dfs(board,i,j,chword,start);
                if(flag){
                    System.out.println(flag);
                }
            }
        }
        System.out.println(false);
    }

    private static Boolean dfs(char[][] board, int i, int j, char[] chword, int start) {
        if(start==chword.length-1){
            return board[i][j]==chword[start];
        }
        //        x-1,y
        // x,y-1  x,y    x,y+1
        //        x+1,y
        int[][] direction = {{-1, 0},
                             {0, -1},
                             {0, 1},
                             {1, 0}};
         if(board[i][j]==chword[start]){
            marked[i][j] = true;
            for(int k=0;k<4;k++){
                int newX = i+direction[k][0];
                int newY = j+direction[k][1];
                if(inArea(newX,newY,board)&&!marked[newX][newY]){
                    if(dfs(board,newX,newY,chword,start+1)){
                        return true;
                    }
                }
            }
            marked[i][j] = false;
        }
        return false;
    }

    private static boolean inArea(int newX, int newY, char [][]board) {
        if(newX>=0&&newY>=0&&newX<board.length&&newY<board[0].length){
            return true;
        }
        else{
            return false;
        }
    }
}
