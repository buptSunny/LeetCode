package LeetCode.Offer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lc73 {
    class Solution {
        public void setZeroes(int[][] matrix) {
        /*
            遍历，找到0元素的坐标，横坐标加入一个set；纵坐标加入一个set；
         */
            Set<Integer> mindex = new HashSet();
            Set<Integer> nindex = new HashSet();
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    if(matrix[i][j]==0){
                        mindex.add(i);
                        nindex.add(j);
                    }
                }
            }

            Iterator it = mindex.iterator();
            while(it.hasNext()){
                int zerom = (int) it.next();
                for(int j=0;j<matrix[0].length;j++){
                    matrix[zerom][j] = 0;
                }
            }

            Iterator it2 = nindex.iterator();
            while(it2.hasNext()){
                int zeron = (int) it2.next();
                for(int i=0;i<matrix.length;i++){
                    matrix[i][zeron] = 0;
                }
            }
        }
    }
}
