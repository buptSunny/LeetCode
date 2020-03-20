package LeetCode.Offer;

/*
    旋转数组的最小数字
 */
public class offer11 {
    public static void main(String[] args) {
        int [] numbers = {10,1,10,10,10};
        // * 逆序对为最小数字
        // * 与right比较，大于，小于，等于 三种情况。
        int left = 0;
        int right = numbers.length-1;
        int mid = 0;
        while(left<=right){
            mid = (left+right)/2;
            if(mid+1<=right&&numbers[mid]>numbers[mid+1]){
                System.out.println(numbers[mid+1]);
                break;
            }
            if(mid-1>=left&&numbers[mid]<numbers[mid-1]){
                System.out.println(numbers[mid]);
                break;
            }
            if(numbers[mid]>numbers[right]){
                left = mid+1;
            }
            else if(numbers[mid]<numbers[right]){
                right = mid-1;
            }else if(numbers[mid]==numbers[right]){
                right -= 1;
            }
        }
        System.out.println(numbers[mid]);
}}

