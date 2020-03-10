package LeetCode.LC;

import java.util.Arrays;

public class Lc34 {
    public static void main(String[] args) {
        int[] nums = {2,2};
        int target = 3;
        int[] res = searchRange(nums,target);
        System.out.println(Arrays.toString(res));
    }
        public static int[] searchRange(int[] nums, int target) {
            if (nums.length == 0) {
                int[] res = {-1, -1};
                return res;
            }
            int left = binaryFindLeft(nums, target);
            int right = binaryFindRight(nums, target);
            int[] res = {left, right};
            return res;
        }
        public static int binaryFindLeft(int[] nums, int target) {
            int left = 0;
            int right = nums.length;
            while (left < right) {
                int mid = (left + right) / 2;
                if (nums[mid] > target) {
                    right = mid;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else if (nums[mid] == target) {
                    right = mid;
                }
            }
            if (left >= nums.length) {
                return -1;
            }
            if (nums[left] == target) {
                return left;
            } else {
                return -1;
            }
        }
        public static int binaryFindRight(int[] nums, int target) {
            int left = 0;
            int right = nums.length;
            while (left < right) {
                int mid = (left + right) / 2;
                if (nums[mid] > target) {
                    right = mid;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else if (nums[mid] == target) {
                    left = mid + 1;
                }
            }
            if (left == 0) {
                return -1;
            }
            if (nums[left - 1] == target) {
                return left - 1;
            } else {
                return -1;
            }
        }

}
