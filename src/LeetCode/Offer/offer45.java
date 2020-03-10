package LeetCode.Offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
/*
    ① 重写排序方式
    ② 全排列后取min
 */
public class offer45 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] numbers = {3,32,321};
        if(numbers == null || numbers.length == 0){
            System.out.println("null");
        }
        int len = numbers.length;
        String []str = new String[len];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            str[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String c1 = o1+o2;
                String c2 = o2+o1;
                return c1.compareTo(c2);
            }
        });
        for(int i=0;i<len;i++){
            sb.append(str[i]);
        }
        System.out.println(sb.toString());
    }
}
