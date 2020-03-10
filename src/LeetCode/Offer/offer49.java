package LeetCode.Offer;

public class offer49 {
    public static void main(String[] args) {
        int index = 1500;
        int[] arrays = new int[1500];
        arrays[0] = 1;
        arrays[1] = 2;
        arrays[2] = 3;
        arrays[3] = 4;
        arrays[4] = 5;
        int[] sup = new int[1500];
        sup = arrays;
        int min2 = 111111111;
        int min3 = 111111111;
        int min5 = 111111111;
        for(int i=4;i<1499;i++){
            for(int j=0;j<i;j++){
                /*
                    把这当中所有的丑数拿出来
                 */
                if(sup[j]*2>arrays[i]){
                    min2 = sup[j]*2;
                    break;
                }
            }

            for(int j=0;j<i;j++){
                /*
                    把这当中所有的丑数拿出来
                 */
                if(sup[j]*3>arrays[i]){
                    min3 = sup[j]*3;
                    break;
                }
            }

            for(int j=0;j<i;j++){
                /*
                    把这当中所有的丑数拿出来
                 */
                if(sup[j]*5>arrays[i]){
                    min5 = sup[j]*5;
                    break;
                }
            }

            int min = Math.min(min2,min3);
            min = Math.min(min,min5);
            arrays[i+1] = min;
            sup[i] = arrays[i];
        }
        System.out.println(arrays[1499]);

        int res = UglyNumbers(index);
        System.out.println(res);

    }

    private static int UglyNumbers(int index) {
        int uglyNums[] = new int[index];
        int two=0,three=0,five=0;
        if (index<=0) return -1;
        uglyNums[0]=1;
        for(int i=1;i<index;i++){
            uglyNums[i]=min(2*uglyNums[two] ,3*uglyNums[three],5*uglyNums[five]);
            if (uglyNums[i]== 2*uglyNums[two] ) two++;
            if (uglyNums[i]== 3*uglyNums[three] ) three++;
            if (uglyNums[i]== 5*uglyNums[five] ) five++;
        }
        return uglyNums[index-1];

    }

    public static int min(int a,int b,int c){
        int min = a;
        min = Math.min(a,b);
        return Math.min(min,c);
    }
}
