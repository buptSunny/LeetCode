package LeetCode.LC;

import java.util.ArrayList;

public class Lc54 {
    public static void main(String[] args) {
        int[][] matrix = {{1,11},{2,12},{3,13},{4,14},{5,15},{6,16},{7,17},{8,18},{9,19},{10,20}};
        int startX = 0;
        int startY = 0;
        int endX = matrix.length-1;
        int endY = matrix[0].length-1;
        ArrayList list = new ArrayList();
        while(startX<endX&&startY<endY){
            for(int i=startY;i<endY;i++){
                list.add(matrix[startX][i]);
            }
            for(int i=startX;i<endX;i++){
                list.add(matrix[i][endY]);
            }
            for(int i=endY;i>startY;i--){
                list.add(matrix[endX][i]);
            }
            for(int i=endX;i>startX;i--){
                list.add(matrix[i][startY]);
            }
            startX++;
            endX--;
            startY++;
            endY--;
        }
        System.out.println(list.toString());
        if(startX==endX){
            for(int i=startY;i<=endY;i++){
                list.add(matrix[startX][i]);
            }
        }
        else if(startY==endY){
            for(int i=startX;i<=endX;i++){
                list.add(matrix[i][startY]);
            }
        }
        System.out.println(list.toString());

    }
}
