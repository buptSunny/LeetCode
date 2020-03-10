package LeetCode.Offer;

public class offer20 {
    public static void main(String[] args) {
        char[] str = {1,5,4,5};
        Boolean flag = isNumeric(str);
        System.out.println(flag);
    }

    public static boolean isNumeric(char[] str) {

        //判断数据合理
        if(str == null){
            return false;
        }

        int index = 0; //记录+-
        int encount = 0; //记录 e
        int point = 0; //记录点
        //+—可以玩为第一个或者 在 e之后
        if(str[0] == '-' || str[0] == '+' )
            index++;

        for(int i = index; i < str.length; i++){
            if(str[i] == '-' || str[i] == '+'){
                if(str[i-1] == 'e' ||  str[i-1]== 'E') //即!-又!=
                    continue;
                else
                    return false;

            }

            //如果是e就得 不能出现首位末尾 并且 前为数字
            if(str[i] == 'e' || str[i] == 'E'){
                encount++;
                if(encount > 1)
                    return false;
                if(i == 0  || i == str.length-1 )
                    return false;
                if(str[i-1] > 57 || str[i-1] <48)
                    return false;
                point++;
                continue;
            }
            //点不能出现 末位只能出现一次，不能出现指数之后，所以在E出现后要标记
            if(str[i] == '.'){
                if(i == str.length-1)
                    return false;
                point++;
                if(point > 1)
                    return false;
                continue;
            }
            //如果以上符号都不是，在判断是不是其他字符
            if(str[i] > 57 || str[i] < 48)
                return false;
        }
        return true;
    }
}
