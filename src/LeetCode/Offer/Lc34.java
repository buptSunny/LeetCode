package LeetCode.Offer;

public class Lc34 {
    public static void main(String[] args) {
        int[] nums = {2,2};
        int target = 3;
        int left = binaryFindLeft(nums, target);
        int right = binaryFindRight(nums, target);
        System.out.println(left);
        System.out.println(right);
    }

    private static int binaryFindLeft(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = left + 1;
            } else if (nums[mid] == target) {
                right = mid;
            }
        }
        System.out.println(left);
        if(left>=nums.length){
            return -1;
        }
        if (nums[left] == target) {
            return left;
        } else {
            return -1;
        }
    }

    private static int binaryFindRight(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = left + 1;
            } else if (nums[mid] == target) {
                left = mid + 1;
            }
        }
        if(left==0){
            return -1;
        }
        if (nums[left - 1] == target) {
            return left - 1;
        } else {
            return -1;
        }
    }


    private static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = left + 1;
            } else if (nums[mid] == target) {
                return mid;
            }
        }
        return -1;
    }
}
