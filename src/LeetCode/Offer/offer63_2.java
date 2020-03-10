package LeetCode.Offer;

public class offer63_2 {
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        /*
            valley 比左边的数小，直到大于左边的数：valley；
            peek  比左边的数大，直到小于左边的数：peek
         */
        int index = 1;
        int valley = 0;
        int peek = 0;
        int res = 0;
        while(index<nums.length-1){
            while(nums[index]<nums[index-1]&&index<nums.length-1){
                index++;
            }
            valley = nums[index-1];
            while(nums[index]>nums[index-1]&&index<nums.length-1){
                index++;
            }
            peek = nums[index-1];
            res += peek-valley;
            index++;
        }
        System.out.println(res);
    }
}
