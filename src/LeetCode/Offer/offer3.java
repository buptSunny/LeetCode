package LeetCode.Offer;
/*
    数组中的重复数字，有一个长度为n的数组，其数字都在0~n-1的范围内，找到所有的重复数字
    思路：
        遍历整个数组，判断数组的下标与数组元素是否相同，如果相同，则继续判断下一个。
        如果不同，将该元素值与数组[元素值]相比较，如果相同，则输出该元素。如果不同，则交换两个元素，继续判断该元素。
    时间复杂度o(n)，无需额外空间
 */
import java.util.ArrayList;
import java.util.Arrays;

public class offer3 {
    public static void main(String[] args) {
        int [] nums = {2,3,1,0,2,5,3};
        ArrayList<Integer> res = new ArrayList();
        int i = 0;
        while(i< nums.length) {
            System.out.println(Arrays.toString(nums));
            if(nums[i]!=i){
                if(nums[i]==nums[nums[i]]){
                    res.add(nums[i]);
                    i++;
                }
                else{
                    /*
                        这里注意不能用nums[nums[i]]，更新了nums[i]后，这个索引的位置也会改变
                     */
                    int temp = nums[i];
                    int t = nums[i];
                    nums[i] = nums[nums[i]];
                    nums[t] = temp;
                }
            }else{
                i++;
            }
        }
        System.out.println(res);
    }
}
