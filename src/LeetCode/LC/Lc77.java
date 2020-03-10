package LeetCode.LC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lc77 {
    static ArrayList<List<Integer>> list = new ArrayList<>();
    static ArrayList<Integer> temp =  new ArrayList();

    public static void main(String[] args) {
        int n = 4;
        int k = 2;
            combine(n,k,temp,1);
        System.out.println(list.toString());
    }
    private static void combine(int n, int k,ArrayList<Integer> temp,int start) {
        if(temp.size()==k){
            ArrayList<Integer> t = new ArrayList();
            for(int i=0;i<temp.size();i++){
                t.add(temp.get(i));
            }
            list.add(t);
            return;
        }
        for(int i=start;i<=n;i++){
            temp.add(i);
            combine(n,k,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
