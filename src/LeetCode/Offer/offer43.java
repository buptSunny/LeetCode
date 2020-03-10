package LeetCode.Offer;

public class offer43 {
    public static void main(String[] args) {
        int nums =534;
        int res = NumsOfOneInNumber(nums);
        System.out.println(res);
    }
    private static int NumsOfOneInNumber(int nums) {
        int n = nums;
        if (n < 1){
            return 0;
        }
        int count = 0;
        int base = 1;
        int round = n;
        int former = 0;
        int weight = 0;
        while(round>0){
            weight = round%10;
            round = round/10;
            former = n%base;

            count += round*base;
            if(weight>1){
                count+=base;
            }
            else if(weight ==1){
                count+=former;
            }
            base = base*10;
        }
        return count;
    }
}
