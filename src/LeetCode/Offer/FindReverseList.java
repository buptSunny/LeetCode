package LeetCode.Offer;

public class FindReverseList {
    public static void main(String[] args) {
        int[] nums = {5,1,3};
        int target = 5;
        int res = search(nums, target);
        System.out.println(nums[res]);
    }

    private static int search(int[] nums, int target) {
        /*
            旋转数组的旋转点是不是能先找到？
         */
        if (nums[nums.length - 1] > nums[0]) {
            System.out.println("没旋转");
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else if (nums[mid] < nums[left]) {
                right = mid ;
            } else if (nums[mid] >= nums[left] && nums[mid] <= nums[right]) {
                break;
            }
        }
        return left;
    }
}