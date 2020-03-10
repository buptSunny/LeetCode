package LeetCode.Offer;


public class offer14 {
    public static void main(String[] args) {
        int n = 8;
        int[] arrays = new int[n+1];
        arrays[0] = 0;
        arrays[1] = 1;
        arrays[2] = 2;
        arrays[3] = 3;
        int max = 0;
        for(int i = 4;i<=8;i++){
            max = 0;
            for(int j = 0; j <= i/2; j++){
                int temp = arrays[j]*arrays[i-j];
                if(temp>max){
                    max = temp;
                }
            }
            arrays[i] = max;
        }
        System.out.println(arrays[8]);
    }
}

