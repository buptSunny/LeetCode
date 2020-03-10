package LeetCode.LC;

public class Lc81 {
    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else if (nums[mid] < nums[left]) {
                right = mid ;
            } else if (nums[mid] >= nums[left] && nums[mid] <= nums[right]) {
                break;
            }
        }
        System.out.println(nums[left]);
        System.out.println(left);
   }
}
