package LeetCode.LC;


/*
给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
        示例 1：

        输入: "babad"
        输出: "bab"
        注意: "aba" 也是一个有效答案。
        示例 2：

        输入: "cbbd"
        输出: "bb"


        来源：力扣（LeetCode）
        链接：https://leetcode-cn.com/problems/longest-palindromic-substring
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

 */
public class Lc5 {
    /*
        每一个元素都可以是中心；
        最长回文子串可以是奇数/偶数
        奇数如aba left=1；right=1；向两边扩展；
        偶数如abba left=1；right=2；向两边扩展；
     */
    static int max = 0;
    static int leftIndex = 0;
    static int rightIndex = 0;
    public static void main(String[] args) {
        String s = "ac";
        if(s.length()<2){
            System.out.println(s.length());
        }
        for(int i=0;i<s.length();i++){
            extend(s,i,i);
            extend(s,i,i+1);
        }
        System.out.println(leftIndex);
        System.out.println(rightIndex);
        System.out.println(s.substring(leftIndex,leftIndex+max+1));
    }

    private static void extend(String s, int left, int right) {

        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)&&left<right){
            left--;
            right++;
        }
        if(right-left-1>max){
            max = right-left-1;
            rightIndex = right-1;
            leftIndex = left+1;
        }
    }


}
