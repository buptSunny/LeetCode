package LeetCode.Offer;
import java.util.Arrays;

public class offer21 {
    public static void main(String[] args) {
          int[] arrays = {1,2,3,4,5,6};
          int left = 0;
          int right = arrays.length-1;
          while(left<right){
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 while(arrays[left]%2==1&&left<right){
                  left++;
              }
              while(arrays[right]%2==0&&left<right){
                  right--;
              }
              /*
              交换left和right
               */
              int temp = arrays[left];
              arrays[left] = arrays[right];
              arrays[right] = temp;
          }
        System.out.println(Arrays.toString(arrays));
    }
}
