package LeetCode.Offer;
/*
给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
示例:
给定 nums = [2, 7, 11, 15], target = 9
因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/two-sum
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

 */


import java.util.HashMap;

public class No1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Solution1 s = new Solution1();
        int [] res = s.twoSum(nums,target);
        for(int i =0 ; i < res.length; i++)
            System.out.println(res[i]);
    }

}

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> map = new HashMap();
        int [] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target- nums[i])){
                System.out.println(map);
                res[0] = map.get(target-nums[i]);
                res[1] = i;
                break;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}

