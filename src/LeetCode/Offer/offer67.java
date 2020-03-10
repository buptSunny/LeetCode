package LeetCode.Offer;

public class offer67 {
    public static void main(String[] args) {
        /*
            字符串转整数(反转整数)
         */
        String s = "-123";
        char[] strs = s.toCharArray();
        Boolean flag = false;
        if(strs[0]=='-'){
            flag = true;
        }
        /*
            字符串可以合法转成数字
         */
        int index = 0;
        if(flag){
            index++;
        }
        int total = 0;
    /*
        while(index<strs.length){
            int num = (int) strs[index]-'0';
            total = total*10 + num;
            index++;
        }
     */
        int i = strs.length-1;
        while(i>=index){
            int num = (int) strs[i]-'0';
            total = total*10 + num;
            i--;
        }

        if(flag) {
            System.out.println(-total);
        }else{
            System.out.println(total);
        }

    }
}
