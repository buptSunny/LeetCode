package LeetCode.Offer;
import java.util.ArrayList;

public class offer17 {
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> temp = new ArrayList<>();
        permutations(temp,n);
    }
/*
    ArratList.size() = arrays.length
    Arrays工具类
 */
    private static void permutations(ArrayList<Integer> temp, int n) {
        if(temp.size()==n){
            System.out.println(temp.toString());;
            return;
        }
        for(int i=0;i<10;i++){
            temp.add(i);
            permutations(temp,n);
            temp.remove(temp.size()-1);
        }
    }
}
