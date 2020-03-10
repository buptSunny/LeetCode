package LeetCode.Offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class offer58 {
    public static void main(String[] args) {

        String strs = "I am a good boy.";
        String[] str = strs.split(" ");
        ArrayList list = new ArrayList();
        for(int i=str.length-1;i>=0;i--){
            list.add(str[i]);
            System.out.println(str[i]);
        }
        System.out.println(list.toString());
    }
}
