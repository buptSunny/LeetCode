package LeetCode.LC;

import java.util.ArrayList;
import java.util.Arrays;

public class Lc59 {
    public static void main(String[] args) {
        int n = 3;
        int[][] temp = new int[n][n];
        int startX = 0;
        int startY = 0;
        int endX = n - 1;
        int endY = n - 1;
        int count = 1;
        ArrayList<Integer> list = new ArrayList<>();
        while (startX < endX && startY < endY) {
            for (int i = startY; i < endY; i++) {
                temp[startX][i] = count;
                count ++;
            }
            for (int i = startX; i < endX; i++) {
                temp[i][endY] = count;
                count++;
            }
            for (int i = endY; i > startY; i--) {
                temp[endX][i]=count;
                count++;
            }
            for (int i = endX; i > startX; i--) {
                temp[i][startY]=count;
                count++;
            }
            startX++;
            startY++;
            endX--;
            endY--;
        }
        if (startX == endX) {
            for (int i = startY; i <= endY; i++) {
                temp[startX][i]=count;
                count++ ;
            }
        }
        System.out.println(Arrays.deepToString(temp));
    }
}
