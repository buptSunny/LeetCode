package LeetCode.LC;

public class Lc306 {
    public static void main(String[] args) {
        String nums = "101";
        /*
            前两个数固定，每次固定两个数，然后去判断，只要一个符合，即可
         */

        for(int i=1;i<nums.length()-1;i++){
            int a = Integer.parseInt(nums.substring(0,i));
            for(int j=i+1;j<nums.length();j++){
                if(!nums.substring(i,j).equals("0")&&nums.substring(i,j).startsWith("0")){
                    continue;
                }
                int b = Integer.parseInt(nums.substring(i,j));
                Boolean flag = IsAddNumber(nums,a,b,j);
                System.out.println(flag);
                System.out.println(a);
                System.out.println(b);
                if(flag==true){
                    System.out.println(true);
                }
            }
        }
        System.out.println(false);

    }

    private static Boolean IsAddNumber(String nums, int a, int b,int j) {

        int sum = a+b;
        String subSum = String.valueOf(sum);
        if(nums.length()-j<subSum.length()){
            return false;
        }

        for(int i=0;i<subSum.length();i++){
            if(subSum.charAt(i)==nums.charAt(j)){
                j++;
            }
            else{
                return false;
            }
        }
        if(j==nums.length()){
            return true;
        }else{
            return IsAddNumber(nums,b,sum,j);
        }

    }
}


class Solution {
    public boolean isAdditiveNumber(String num) {
        if (num.length() < 3) return false;
        int n = num.length();
        for (int i = 1; i <= (n - 1) / 2; i++) {
            if (i > 1 && num.charAt(0) == '0') break;
            for (int j = i + 1; (n - j) >= i && (n - j) >= j - i; j++) {
                if (j - i > 1 && num.charAt(i) == '0') break;
                long num1 = Long.parseLong(num.substring(0, i));
                long num2 = Long.parseLong(num.substring(i, j));
                if (isAdditive(num.substring(j), num1, num2))
                    return true;
            }
        }
        return false;
    }

    private boolean isAdditive(String remain, long num1, long num2) {
        if (remain.equals("")) return true;
        long sum = num1 + num2;
        String str = String.valueOf(sum);
        if (!remain.startsWith(str)) return false;
        return isAdditive(remain.substring(str.length()), num2, sum);
    }
}