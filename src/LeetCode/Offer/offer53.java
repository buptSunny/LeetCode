package LeetCode.Offer;

public class offer53 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,3,3,3,3,4,5};
        int target = 3;
        int res = timesOfnumber(nums,target);
    }

    private static int timesOfnumber(int[] nums, int target) {
        int left = findLeft(nums,target);
        System.out.println(left);
        int right = findRight(nums,target);
        System.out.println(right);
        return right-left+1;

    }

    private static int findRight(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while(left<right){
            int mid = (right+left)/2;
            if(nums[mid]<target){
                left = mid+1;
            }
            else if(nums[mid]>target){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        if(left==0){
            return -1;
        }
        if(nums[left-1]==target&&nums!=null){
            return left-1;
        }
        else{
            return -1;
        }
    }

    private static int findLeft(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while(left<right){
            int mid = (right+left)/2;
            if(nums[mid]<target){
                left = mid+1;
            }
            else if(nums[mid]>target){
                right = mid;
            }
            else{
                right = mid;
            }
        }
        if(left==nums.length){
            return -1;
        }
        if(nums[left]==target&&nums!=null){
            return left;
        }
        else{
            return -1;
        }
    }
}

