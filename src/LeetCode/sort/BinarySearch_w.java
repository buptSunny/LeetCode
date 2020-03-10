package LeetCode.sort;

public class BinarySearch_w {
    public static void main(String[] args) {
        int [] arrays = {1,3,4,5,6,7,9};
        int target = 7;
        int low = 0;
        int high = arrays.length-1;
        while(low<high){
            int mid = (high+low)/2;
            if(arrays[mid]<target){
                low = mid + 1 ;
            }
            else if(arrays[mid]>target){
                high = mid;
            }
            else{
                System.out.println(mid);
                break;
            }
        }
        System.out.println("-1");
    }
}
