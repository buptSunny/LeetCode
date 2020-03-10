package LeetCode.LC;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Lc31 {
    public static void main(String[] args) {
        int[] nums = {1,5,1};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void nextPermutation(int[] nums) {
        /*
        根据题意，自然是字典序最大也就是降序排列的时候，因为这种情况的下一个排列就是字典序最小的，将原序列逆序就行了。
        对于任意一个序列，我们从后往前找，先找到一个最长递减子序列，比如2 1 7 5 4 3，那么最长递减子序列就是7 5 4 3，把它逆序，变成3 4 5 7，
        这是最小序列，这时整个序列变成了2 1 3 4 5 7。这样还不够，我们还要满足比原序列的字典序大，其实也好处理，最长递减子序列的前一个元素是1，
        我们只需要在最小的序列3 4 5 7中找一个比它大并且最接近它的元素，将它换掉就可以了，显然这个替换的元素是3（替换并没有破坏最小序列的单调性），
        这样整个序列就变成了2 3 1 4 5 7，这也就是我们的目标序列。
         */
        int index = nums.length-2;
        while (nums[index] >= nums[index + 1]&&index>=0) {
            index--;
        }
        if(index>=0){
            int j = nums.length-1;
            while(nums[j]<=nums[index]){
                j--;
            }
            System.out.println(index);
            System.out.println(j);
            swap(nums,index,j);
        }
        reverse(nums,index+1);
    }

    private static void reverse(int[] nums, int index) {
        int right = nums.length-1;
        while(index<right){
            swap(nums,index,right);
            index++;
            right--;
        }
    }

    private static void swap(int[] nums, int index, int j) {
        int temp = nums[index];
        nums[index] = nums[j];
        nums[j] = temp;
    }
}
