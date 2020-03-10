package LeetCode.LC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Lc18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> resLists = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int len = nums.length;
        if (len == 4) {
            if(nums[0]+nums[1]+nums[2]+nums[3] == target){
                resLists.add(Arrays.asList(nums[0],nums[1],nums[2],nums[3]));
                return resLists;
            }else{
                return resLists;
            }
        }
        for (int i = 0; i < len-3; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            //通过判断优化代码段
            if ((nums[i] + nums[i+1] + nums[i+2] + nums[i+3]) > target) {
                break;
            }
            if ((nums[i] + nums[len-1] + nums[len-2] + nums[len-3]) < target) {
                continue;
            }
            for (int j = len-1; j > i ; j--) {
                if (j < len-1 && nums[j] == nums[j+1]) {
                    continue;
                }
                int l = i+1;
                int r = j-1;
                while (l < r && r > i && l < j) {
                    int sum = nums[i] + nums[j] + nums[r] + nums[l];
                    if (sum > target) {
                        r--;
                    }else if (sum < target) {
                        l++;
                    }else {
                        resLists.add(Arrays.asList(nums[i],nums[l],nums[r],nums[j]));
                        while (nums[r] == nums[r-1] && l < r) {
                            r--;
                        }
                        while (nums[l] == nums[l+1] && l < r) {
                            l++;
                        }
                        r--;
                        l++;
                    }

                }
            }
        }
        return resLists;
    }
}