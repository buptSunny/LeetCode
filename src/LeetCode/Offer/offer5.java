package LeetCode.Offer;


public class offer5 {
    public static void main(String[] args) {
        String s = "We are happy";
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sbn = new StringBuilder();
        for(int i = 0;i < sb.length();i++){
            if(sb.charAt(i)==' '){
                sbn.append("%20");
            }else{
                sbn.append(sb.charAt(i));
            }
        }




        System.out.println(sbn.toString());
    }
}
