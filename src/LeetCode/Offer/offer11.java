package LeetCode.Offer;

/*
    旋转数组的最小数字
 */
public class offer11 {
    public static void main(String[] args) {
        int [] arrays = {7,8,9,10,11,12,14,15,1,1,2,4,5,6};
        int low = 0;
        int high = arrays.length-1;
        int mid = 0;
        while(low < high){
            mid = (high + low)/2;
            if(arrays[mid]<arrays[mid-1]&&arrays[mid]<arrays[mid+1]){
                System.out.println(mid);
                break;
            }
            if(arrays[mid]<arrays[low]){
                high = mid;
            }
            else if(arrays[mid]>arrays[high]){
                low = mid+1;
            }
            else{
                System.out.println(low);
                break;
            }
        }
        System.out.println(arrays[high]);
    }
}

