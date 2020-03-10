package LeetCode.sort;

public class Binarysearch_s {
    public static void main(String[] args) {
        int [] arrays = {1,3,4,5,6,7,9};
        int target = 8;
        int index = binary(arrays,target,0,arrays.length-1);
        System.out.println(index);
    }

    private static int binary(int[] arrays, int target,int low, int high) {
        if(low < high){
            return -1;
        }
        int mid = (high-low)/2+low;
        if(arrays[mid]>target){
            return binary(arrays,target,low,mid);
        }
        else if(arrays[mid]<target){
            return binary(arrays,target,mid+1,high);
        }
        else{
            return mid;
        }
    }
}
